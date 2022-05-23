package bit_Manipulation;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();

        if ((n & (n - 1)) == 0) {
            System.out.println("the number " + n + " is the power of 2");
        } else {
            System.out.println("the number " + n + " is not the power of 2");
        }
    }
}
