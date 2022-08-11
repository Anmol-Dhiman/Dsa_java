package DynamicProgramming;

import java.util.Scanner;

public class MinimumSubset {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of input : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the number : ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();

        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0)
                    dp[i][j] = false;
                if (j == 0)
                    dp[i][j] = true;
            }
        }

        settingDPTable(dp, a, n, sum);

        System.out.print("find the minimum difference : " + minimumSubset(n, a, sum, dp));

    }

    private static void settingDPTable(boolean[][] dp, int[] a, int n, int sum) {

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (a[i - 1] <= j) {
                    dp[i][j] = max(dp[i - 1][j - a[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

    }

    private static boolean max(boolean a, boolean b) {
        if (a == true || b == true)
            return true;
        return false;
    }

    private static int minimumSubset(int n, int[] a, int sum, boolean[][] dp) {

        int index = 0;
        for (int i = 0; i <= sum / 2; i++) {
            if (dp[n][i] == true) {
                index = i;
            }
        }

        return (sum - 2 * index);

    }
}
