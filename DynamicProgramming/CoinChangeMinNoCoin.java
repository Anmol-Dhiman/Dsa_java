package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeMinNoCoin {
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
                    dp[i][j] = Integer.MAX_VALUE - 1;
            }
        }

        // System.out.print("Minimum number of ways to find the sum " + sum + " is " + coinMin(n, sum, a, dp));
    }

    // private static int coinMin(int n, int sum, int[] a, int[][] dp) {
    //     for (int i = 2; i < n + 1; i++) {
    //         for (int j = 1; j < sum + 1; j++) {
    //             if (a[i - 1] <= j) {
    //                 dp[i][j] = Math.min(1 + dp[i][j - a[i - 1]], dp[i - 1][j]);
    //             } else {
    //                 dp[i][j] = dp[i - 1][j];
    //             }
    //         }
    //     }
    //     return dp[n][sum];
    // }

}
