package DynamicProgramming;

import java.util.Scanner;

public class SubsetProblem {

    // in this question we have an array and a sum and we have to find weather we
    // have a subset whose element sum is equal to given sum

    // private static boolean[][] t = new boolean[n + 1][sum + 1];
    private static boolean[][] t = new boolean[6][12];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the sum : ");
        int sum = sc.nextInt();
        sc.close();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                if (i == 0)
                    t[i][j] = false;
                if (j == 0)
                    t[i][j] = true;
            }
        }

        System.out.println("Does the subset is available whose sum is : " + sum + " " + subsetExist(n, sum, arr));
        System.out.print("Does the subset is available whose sum is : " + sum + " " + subsetExistDP(n, sum, arr));

    }

    private static boolean subsetExist(int n, int sum, int[] arr) {

        if (n == 0 && sum == 0)
            return true;
        else if (n == 0 && sum != 0)
            return false;
        if (arr[n - 1] <= sum) {
            return max(subsetExist(n - 1, sum - arr[n - 1], arr), subsetExist(n - 1, sum, arr));
        } else {
            return subsetExist(n - 1, sum, arr);
        }
    }

    private static boolean max(boolean a, boolean b) {
        if (a == true || b == true)
            return true;
        return false;
    }

    private static boolean subsetExistDP(int n, int sum, int[] arr) {

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
