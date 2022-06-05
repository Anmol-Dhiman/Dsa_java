package bit_Manipulation;

import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the index");
        int i = sc.nextInt();

        clearBit(num, i);
        clearBit2(num, i);

        sc.close();

    }

    public static void clearBit(int num, int i) {
        // here we will set the bit at index i as 1 then we do the xor operation with
        // the 1<<i which will make the position value as 0
        int n = setBit(num, i);
        System.out.println("result after clearing the bit " + (n ^ (1 << i)));
    }

    public static void clearBit2(int num, int i) {
        // here we will use complement of 1<<i and then we will do the & operation with
        // the original value
        int n = ~(1 << i);
        System.out.println("the result after clearing the bit " + (num & n));
    }

    public static int setBit(int num, int i) {
        return (num | (1 << i));
    }
}
