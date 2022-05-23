package bit_Manipulation;

import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the index");
        int i = sc.nextInt();

        getBit(num, i);

        sc.close();

    }

    public static void getBit(int num, int i) {

        if ((num & (1 << i)) != 0) {
            System.out.println("the bit at index " + i + " is 1");
        } else {
            System.out.println("the bit at index " + i + " is 0");
        }
    }
}
