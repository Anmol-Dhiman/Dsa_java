package DynamicProgramming;

import java.util.Scanner;

// we have to add those elements which do not have their pairs 
// so according to that the number of deletion will be equal to the number of insertion

public class minInsPalindrome {
    public static void main(String[] args) {
        String x;
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();

        int[][] dp = new int[x.length() + 1][x.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= x.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }
        sc.close();
        System.out.println("the number of insertion to make a string palindrome is " + insertionForPalindrome(x, dp));

    }

    private static int insertionForPalindrome(String x, int[][] dp) {
        return x.length() - longestPalindrome(x, new StringBuilder(x).reverse().toString(), x.length(), dp);
    }

    private static int longestPalindrome(String x, String y, int n, int[][] t) {
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