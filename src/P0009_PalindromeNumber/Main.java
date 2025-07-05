
package P0009_PalindromeNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = solution.isPalindrome(num) ? "is a palindrome." : "is not a palindrome.";
        System.out.println(num + result);

        sc.close();
    }
}
