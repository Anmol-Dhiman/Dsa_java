package DynamicProgramming;

import java.util.Scanner;

import javax.swing.text.html.FormView;

public class Knapsack01 {

    private static int[][] t = new int[7][7];

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                t[i][j] = -1;
            }
        }

        Scanner in = new Scanner(System.in);

        int[] val = new int[5];
        int[] wgt = new int[5];

        System.out.print("Enter the weight of knapsack : ");

        // here i take the maximum value of w as 5

        int w = in.nextInt();

        for (int i = 0; i < wgt.length; i++) {
            System.out.print("Enter the value: ");
            val[i] = in.nextInt();
            System.out.print("Enter the weight: ");
            wgt[i] = in.nextInt();
        }
        in.close();

        System.out.print("maximum profit : " + knapsack_profit_memoization(w, wgt, val, 5));

    }

    private static int knapsack_profit(int w, int[] wgt, int[] val, int n) {
        if (n == 0 || w == 0)
            return 0;

        if (wgt[n - 1] <= w) {
            return max(val[n - 1] + knapsack_profit(w - wgt[n - 1], wgt, val, n - 1),
                    knapsack_profit(w, wgt, val, n - 1));
        } else {
            return knapsack_profit(w, wgt, val, n - 1);
        }

    }

    private static int knapsack_profit_memoization(int w, int[] wgt, int[] val, int n) {
        if (n == 0 || w == 0)
            return 0;

        if (t[n][w] != -1)
            return t[n][w];

        if (wgt[n - 1] <= w) {
            return t[n][w] = max(val[n - 1] + knapsack_profit(w - wgt[n - 1], wgt, val, n - 1),
                    knapsack_profit(w, wgt, val, n - 1));
        } else {
            return t[n][w] = knapsack_profit(w, wgt, val, n - 1);
        }

    }

    private static int max(int i, int j) {
        if (i > j)
            return i;
        return j;
    }

}
