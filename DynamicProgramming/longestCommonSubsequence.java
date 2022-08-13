package DynamicProgramming;

import java.util.Scanner;

public class longestCommonSubsequence {
    public static void main(String[] args) {

        String x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Stirng : ");
        x = sc.nextLine();
        System.out.print("Enter the second String : ");
        y = sc.nextLine();
        sc.close();

        System.out.print("the lenght of longest common subsequence is : " + lcs(x, y, x.length(), y.length()));

    }

    private static int lcs(String x, String y, int n, int m) {

        if (n == 0 || m == 0)
            return 0;

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return 1 + lcs(x, y, n - 1, m - 1);
        } else {
            return Math.max(lcs(x, y, n - 1, m), lcs(x, y, n, m - 1));
        }

    }
}