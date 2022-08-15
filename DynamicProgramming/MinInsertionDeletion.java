package DynamicProgramming;

import java.util.Scanner;

public class MinInsertionDeletion {
    public static void main(String[] args) {
        String x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Stirng : ");
        x = sc.nextLine();
        System.out.print("Enter the second String : ");
        y = sc.nextLine();
        sc.close();

        int[][] dp = new int[x.length() + 1][y.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }
        int lcs = lcsTopDown(x, y, x.length(), y.length(), dp);

        System.out.println("the number of insertion " + (y.length() - lcs));
        System.out.println("the number of deletion " + (x.length() - lcs));

    }

    private static int lcsTopDown(String x, String y, int n, int m, int[][] dp) {

        int result = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    result = Math.max(result, dp[i][j]);

                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }

}
