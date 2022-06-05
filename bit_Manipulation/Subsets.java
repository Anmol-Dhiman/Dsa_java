package bit_Manipulation;

import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of inputs of the array");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            System.out.print("enter the number ");
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j) )>0)
                    System.out.print(num[j] + " ");
            }
            System.out.println();
        }

    }
}
