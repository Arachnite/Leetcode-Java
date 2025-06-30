
package P0013_RomanToInteger;

import java.util.Scanner;

public class RomanToIntegerMain {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number in Roman Numeral: ");
        String str = sc.nextLine();

        System.out.println("Number: " + solution.romanToInt(str));

        sc.close();
    }
}
