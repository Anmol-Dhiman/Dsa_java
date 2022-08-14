package DynamicProgramming;

import java.util.Scanner;

public class ShortestCommonSuperSequence {
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

        System.out.print("The lenght of shortest common super sequence is : "
                + shortestSubsequence(x, y, x.length(), y.length(), dp));

    }

    private static int shortestSubsequence(String x, String y, int n, int m, int[][] dp) {
        String temp = x + y;
        return temp.length() - lcsTopDown(x, y, n, m, dp);
    }

    private static int lcsTopDown(String x, String y, int n, int m, int[][] t) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[n][m];
    }
}
