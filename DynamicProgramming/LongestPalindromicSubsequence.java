package DynamicProgramming;

import java.util.Scanner;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Stirng : ");
        x = sc.nextLine();
        sc.close();

        int[][] dp = new int[x.length() + 1][x.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= x.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }

        StringBuilder y = new StringBuilder(x);
        System.out.print("Longest Palindromic subsequence " + lcsTopDown(x, y.reverse().toString(), x.length(), dp));

    }

    private static int lcsTopDown(String x, String y, int n, int[][] t) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[n][n];
    }
}
