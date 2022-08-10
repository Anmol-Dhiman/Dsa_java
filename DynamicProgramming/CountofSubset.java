package DynamicProgramming;

import java.util.Scanner;

public class CountofSubset {
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
        // System.out.println("the number of subset " + countSubsetRecursion(n, sum,
        // arr));
        System.out.println("the number of subset " + countSubsetDP(n, sum, arr));

    }

    // private static int countSubsetRecursion(int n, int sum, int[] a) {
    // if (n == 0 || sum == 0)
    // return 1;
    // else if (n == 0 && sum != 0)
    // return 0;

    // if (a[n - 1] <= sum)
    // return (countSubsetRecursion(n - 1, sum - a[n - 1], a) +
    // countSubsetRecursion(n - 1, sum, a));
    // else
    // return countSubsetRecursion(n - 1, sum, a);

    // }

    private static int countSubsetDP(int n, int sum, int[] a) {
        return 0;
    }
}
