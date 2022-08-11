package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = sc.nextInt();

        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        sc.close();

        System.out.print("Fibonacci Number using DP " + fiboDP(n, dp));
        System.out.print("Fibonacci Number using DP " + fiboRecursive(n));

    }

    private static int fiboDP(int n, int[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];

        dp[n] = fiboDP(n - 1, dp) + fiboDP(n - 2, dp);
        return dp[n];
    }

    private static int fiboRecursive(int n) {
        if (n <= 1)
            return n;
        return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }
}
