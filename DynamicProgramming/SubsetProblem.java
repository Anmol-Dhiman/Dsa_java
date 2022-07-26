package DynamicProgramming;

import java.util.Scanner;

public class SubsetProblem {

    // in this question we have an array and a sum and we have to find weather we
    // have a subset whose element sum is equal to given sum

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
        boolean[][] dp = new boolean[sum + 1][n + 1];
        for (int i = 0; i < sum + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0)
                    dp[i][j] = false;
                if (j == 0)
                    dp[i][j] = true;
            }
        }

        System.out.print("Does the subset is available whose sum is : " + sum + " " + subsetExist(n, sum, arr));

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

}
