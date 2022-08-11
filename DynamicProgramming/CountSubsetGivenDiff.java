package DynamicProgramming;

import java.util.Scanner;

public class CountSubsetGivenDiff {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of inputs : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the number : ");
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int diff;
        System.out.print("Enter the difference : ");
        diff = sc.nextInt();

        sc.close();

        // subset one sum : -
        int firstSubsetSum = (diff + sum) / 2;

        int[][] dp = new int[n + 1][firstSubsetSum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < firstSubsetSum + 1; j++) {
                if (i == 0)
                    dp[i][j] = 0;
                if (j == 0)
                    dp[i][j] = 1;
            }
        }
        System.out.print("The number of subset that exists for the given difference " + diff + " is "
                + countSubsetWithDiff(n, firstSubsetSum, a, dp));

    }

    private static int countSubsetWithDiff(int n, int sum, int[] a, int[][] dp) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (a[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - a[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
