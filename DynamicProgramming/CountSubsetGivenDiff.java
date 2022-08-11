package DynamicProgramming;

import java.util.Scanner;

public class CountSubsetGivenDiff {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of inputs : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the number : ");
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int diff;
        System.out.print("Enter the difference : ");
        diff = sc.nextInt();

        sc.close();

        // subset one sum : -
        int firstSubsetSum = (diff + sum) / 2;
        int secondSubsetSum = sum - firstSubsetSum;
        

    }
}
