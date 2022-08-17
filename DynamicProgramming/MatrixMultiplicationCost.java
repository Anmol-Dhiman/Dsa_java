package DynamicProgramming;

import java.util.Scanner;

public class MatrixMultiplicationCost {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of inputs : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[][] t = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                t[i][j] = -1;
            }
        }

        System.out.println("the minimum cost to multiply the matrix is : " + minCost(arr, 1, n - 1));
        System.out
                .println("Bottom up the minimum cost to multiply the matrix is : " + minCostBottomUp(arr, 1, n - 1, t));

    }

    private static int minCost(int[] a, int i, int j) {
        if (i == j)
            return 0;
        int cost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {

            // a[i - 1] * a[k] * a[j] this step is to get the cost for the temperary solved
            // matrix
            int temp = minCost(a, i, k) + minCost(a, k + 1, j) + a[i - 1] * a[k] * a[j];
            cost = Math.min(cost, temp);
        }
        return cost;
    }

    private static int minCostBottomUp(int[] a, int i, int j, int[][] t) {

        if (i == j)
            return 0;

        if (t[i][j] != -1)
            return t[i][j];
        int cost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {

            // a[i - 1] * a[k] * a[j] this step is to get the cost for the temperary solved
            // matrix

            int temp = minCost(a, i, k) + minCost(a, k + 1, j) + a[i - 1] * a[k] * a[j];
            cost = Math.min(cost, temp);
        }
        return t[i][j] = cost;
    }
}
