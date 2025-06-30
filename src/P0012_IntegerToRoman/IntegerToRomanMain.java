
package P0012_IntegerToRoman;

import java.util.Scanner;

public class IntegerToRomanMain {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1-3999): ");
        int num = sc.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Please enter a number between 1 and 3999.");
            return;
        }

        String romanNumeral = solution.intToRoman(num);
        System.out.println("Roman numeral: " + romanNumeral);

        sc.close();
    }
}
