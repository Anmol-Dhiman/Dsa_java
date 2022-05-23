package bit_Manipulation;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the index");
        int i = sc.nextInt();

        setBit(num, i);

        sc.close();

    }

    public static void setBit(int num, int i) {
        System.out.println("the result is " + (num | (1 << i)));
    }
}
