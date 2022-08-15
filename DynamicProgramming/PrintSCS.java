package DynamicProgramming;

import java.util.Scanner;

public class PrintSCS {
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

        System.out.println("the shortest super sequence is : " + shortestSuperSeq(x, y, dp));

    }

    private static String shortestSuperSeq(String x, String y, int[][] dp) {

        lcsTopDown(x, y, x.length(), y.length(), dp);
        String s = "";
        int i = x.length();
        int j = y.length();

        while (i > 0 || j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                s += x.charAt(i - 1);
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    s += y.charAt(j - 1);
                    j--;
                }

                else {
                    s += x.charAt(i - 1);
                    i--;
                }
            }
        }

        return new StringBuilder(s).reverse().toString();

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
