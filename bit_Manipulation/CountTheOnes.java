package bit_Manipulation;

import java.util.Scanner;

public class CountTheOnes {
    public static void main(String[] args) {

        System.out.println(1 << 16);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();
        int count = 0;

        while (n > 0) {
            // n & n - 1 this has the exact same number of 1's except the right most set bit

            n = n & n - 1;
            count++;
        }
        System.out.println("the number of 1 is " + count);

    }

}
