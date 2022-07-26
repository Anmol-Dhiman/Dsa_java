package DynamicProgramming;

import java.util.Scanner;

public class SumPartitionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int n = sc.nextInt();

        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the array item : ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();
        if (sum % 2 != 0)
            System.out.print("Partition is not possible");

        else {
            boolean[][] t = new boolean[n + 1][sum / 2 + 1];

            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < sum / 2 + 1; j++) {
                    if (i == 0)
                        t[i][j] = false;
                    if (j == 0)
                        t[i][j] = true;
                }
            }

            if (sumPartitionRecusive(n, sum / 2, a))
                System.out.println("Partition is possible using recursive method");
            else
                System.out.println("Partition is not possible using recursive method");
            if (sumPartitionDP(n, sum / 2, a, t))
                System.out.println("Partition is possible using dp method");
            else
                System.out.println("Partition is not possible using dp method");

        }
    }

    private static boolean sumPartitionRecusive(int n, int sum, int[] a) {
        if (n == 0 && sum == 0)
            return true;
        else if (n == 0 && sum != 0)
            return false;

        if (a[n - 1] <= sum)
            return sumPartitionRecusive(n - 1, sum - a[n - 1], a);
        else
            return sumPartitionRecusive(n - 1, sum, a);
    }

    private static boolean max(boolean a, boolean b) {
        if (a == true || b == true)
            return true;
        return false;
    }

    private static boolean sumPartitionDP(int n, int sum, int[] arr, boolean[][] t) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = max(t[i - 1][j - arr[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];

    }

}
