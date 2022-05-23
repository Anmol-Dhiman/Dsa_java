package bit_Manipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the index");
        int i = sc.nextInt();

        System.out.println("enter the value");
        int value = sc.nextInt();
        updateBit(num, i, value);

        sc.close();
    }

    public static void updateBit(int num, int i, int value) {
        // first we will clear the bit and then we will set the bit with value<<i;
        int n = ~(1 << i);
        num = num & n;
        System.out.println("result after updating the bit " + (num | (value << i)));
    }
}
