package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeWays {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of inputs : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the number : ");
            a[i] = sc.nextInt();

        }
        int sum;
        System.out.print("Enter the sum : ");
        sum = sc.nextInt();
        sc.close();

        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0)
                    dp[i][j] = 0;
                if (j == 0)
                    dp[i][j] = 1;
            }
        }

        System.out.print("Number of ways to find the sum as " + sum + " is " + coinChangeWays(n, a, sum, dp));

    }

    private static int coinChangeWays(int n, int[] a, int sum, int[][] dp) {
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (a[i - 1] <= j) {
                    dp[i][j] = dp[i][j - a[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
        
    }
}
