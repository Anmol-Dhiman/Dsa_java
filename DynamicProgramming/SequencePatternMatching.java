package DynamicProgramming;

import java.util.Scanner;

public class SequencePatternMatching {
    public static void main(String[] args) {
        String x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Stirng A : ");
        x = sc.nextLine();
        System.out.print("Enter the second String B : ");
        y = sc.nextLine();
        sc.close();

        int[][] dp = new int[x.length() + 1][y.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }

        System.out.print("does String A is the sequence of String B : " + SequencePatternMatching(x, y, dp));

    }

    private static boolean SequencePatternMatching(String x, String y, int[][] dp) {
        int lcs = lcs(x, y, dp);
  
        if (x.length() == lcs) {
            return true;
        }
        return false;
    }

    private static int lcs(String x, String y, int[][] t) {
        int n = x.length();
        int m = y.length();
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
