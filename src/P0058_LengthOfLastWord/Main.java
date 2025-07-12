
package P0058_LengthOfLastWord;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length of the last word in the string is: " + solution.lengthOfLastWord(s));
    }
}
