
package P0066_PlusOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to add one to: ");
        String num = sc.nextLine();

        int[] digits = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            digits[i] = Integer.parseInt(num.substring(i, i + 1));
        }

        int[] newNum = solution.plusOne(digits);
        System.out.print("Result: [");
        for (int i = 0; i <= newNum.length - 1; i++) {
            System.out.print(newNum[i]);
            if (i < newNum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
