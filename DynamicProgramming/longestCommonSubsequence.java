package DynamicProgramming;

import java.util.Scanner;

public class longestCommonSubsequence {
    public static void main(String[] args) {

        String x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Stirng : ");
        x = sc.nextLine();
        System.out.print("Enter the second String : ");
        y = sc.nextLine();
        sc.close();
        int[][] t = new int[x.length() + 1][y.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                t[i][j] = -1;
            }
        }
        int[][] dp = new int[x.length() + 1][y.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }



            
        }

        System.out
                .println("the lenght of longest common subsequence is : " + lcsRecursive(x, y, x.length(), y.length()));
        System.out.println(
                "the lenght of longest common subsequence is : " + lcsMemoization(x, y, x.length(), y.length(), t));
        System.out.println(
                "the lenght of longest common subsequence is : " + lcsTopDown(x, y, x.length(), y.length(), dp));

    }

    private static int lcsRecursive(String x, String y, int n, int m) {

        if (n == 0 || m == 0)
            return 0;

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return 1 + lcsRecursive(x, y, n - 1, m - 1);
        } else {
            return Math.max(lcsRecursive(x, y, n - 1, m), lcsRecursive(x, y, n, m - 1));
        }
    }

    private static int lcsMemoization(String x, String y, int n, int m, int[][] t) {
        if (n == 0 || m == 0)
            return 0;

        if (t[n][m] != -1)
            return t[n][m];

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return t[n][m] = 1 + lcsRecursive(x, y, n - 1, m - 1);
        } else {
            return t[n][m] = Math.max(lcsRecursive(x, y, n - 1, m), lcsRecursive(x, y, n, m - 1));
        }
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