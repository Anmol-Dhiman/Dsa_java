package DynamicProgramming;

import java.util.Scanner;

public class Knapsack_top_down_dp {

    private static int[][] t = new int[6][6];

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
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
        System.out.print("the maximum profit is : " + knapsack_top_down(w, wgt, val, 5));

        System.out.println("");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < w + 1; j++) {
                System.out.print("" + t[i][j] + " ");

            }
            System.out.println("");

        }

    }

    private static int knapsack_top_down(int w, int[] wgt, int[] val, int n) {
        for (int i = 1; i < n + 1; i++) {
            // for n
            for (int j = 1; j < w + 1; j++) {
                // for w
                if (wgt[i - 1] <= j) {
                    t[i][j] = max(val[i - 1] + t[i - 1][j - wgt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

    private static int max(int i, int j) {
        if (i > j)
            return i;
        return j;

    }
}
