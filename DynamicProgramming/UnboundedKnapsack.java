package DynamicProgramming;

import java.util.Scanner;

// in unbounded knapsack we can include the good more than 1 time if it is feasible to our knapsack
// so if we reject the element at cretain position then we will run the code for the next values but if we select the element then we will
// run the code again including that element  


// for rod cutting the code will be same : -


public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of inputs : ");
        n = sc.nextInt();

        int[] val = new int[n];
        int[] wgt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value : ");
            val[i] = sc.nextInt();
            System.out.print("Enter the weight : ");
            wgt[i] = sc.nextInt();
        }

        System.out.print("Enter the weight of knapsack : ");
        int w = sc.nextInt();
        sc.close();

        int[][] dp = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.print("The net profit with unbounded knapsack : " + unboundedKnapsackDP(n, val, wgt, w, dp));

    }

    private static int unboundedKnapsackDP(int n, int[] val, int[] wgt, int w, int[][] dp) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {

                if (wgt[i - 1] <= j) {
                    dp[i][j] = max(val[i - 1] + dp[i][j - wgt[i - 1]], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][w];
    }

    private static int max(int i, int j) {
        if (i > j)
            return i;
        return j;

    }
}
