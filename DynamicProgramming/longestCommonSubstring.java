package DynamicProgramming;

import java.util.Scanner;

public class longestCommonSubstring {
    public static void main(String[] args) {
        String x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Stirng : ");
        x = sc.nextLine();
        System.out.print("Enter the second String : ");
        y = sc.nextLine();
        sc.close();

        System.out
                .println("the lenght of longest common substring is : " + lcsRecursive(x, y, x.length(), y.length()));

    }

    private static int lcsRecursive(String x, String y, int n, int m) {
        if (n == 0 || m == 0)
            return 0;

        if (x.charAt(0) == y.charAt(0)) {
            return 1 + lcsRecursive(x.substring(1), y.substring(1), n - 1, m - 1);
        } else {
            return lcsRecursive(x, y.substring(1), n, m - 1);
        }

    }
}
