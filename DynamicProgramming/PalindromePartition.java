package DynamicProgramming;

import java.util.Scanner;

public class PalindromePartition {
    public static void main(String[] args) {
        String x;
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        sc.close();
        int[][] t = new int[x.length() + 1][x.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= x.length(); j++) {
                t[i][j] = -1;
            }
        }

        System.out.println(
                "Minimum partitions to make every string as palindrome : " + palindromePartition(x, 0, x.length() - 1));
        System.out.println(
                "Memoization Minimum partitions to make every string as palindrome : "
                        + palindromePartitionMemoization(x, 0, x.length() - 1, t));

    }

    private static int palindromePartition(String x, int i, int j) {
        if (i == j)
            return 0;
        if (isPalindrome(x, i, j))
            return 0;
        int ans = Integer.MAX_VALUE, temp;
        for (int k = i; k <= j - 1; k++) {
            temp = palindromePartition(x, i, k) + palindromePartition(x, k + 1, j) + 1;
            ans = Math.min(ans, temp);
        }
        return ans;
    }

    private static boolean isPalindrome(String x, int i, int j) {
        while (i < j) {
            if (x.charAt(i) != x.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    private static int palindromePartitionMemoization(String x, int i, int j, int[][] t) {

        if (i == j)
            return 0;
        if (isPalindrome(x, i, j))
            return t[i][j] = 0;

        if (t[i][j] != -1)
            return t[i][j];
        int ans = Integer.MAX_VALUE, temp;
        for (int k = i; k <= j - 1; k++) {
            temp = palindromePartition(x, i, k) + palindromePartition(x, k + 1, j) + 1;
            ans = Math.min(ans, temp);
        }
        return t[i][j] = ans;
    }
}
