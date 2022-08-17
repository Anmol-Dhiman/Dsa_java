package DynamicProgramming;

import java.security.cert.X509CRLEntry;
import java.util.Scanner;

public class PalindromePartition {
    public static void main(String[] args) {
        String x;
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();

        System.out.println(
                "Minimum partitions to make every string as palindrome : " + palindromePartition(x, 0, x.length() - 1));

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
        while(i < j)
        {
          if(x.charAt(i) != x.charAt(j))
            return false; 
          i++;
          j--;
        }
        return true;
    }
}
