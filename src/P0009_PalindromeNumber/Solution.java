
package P0009_PalindromeNumber;

public class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0) {

            return false;

        }

        if (x < 10) {

            return true;

        }

        String str = Integer.toString(x);
        String reversedStr = new StringBuilder(str).reverse().toString();

        return str.equals(reversedStr);
    }

}
