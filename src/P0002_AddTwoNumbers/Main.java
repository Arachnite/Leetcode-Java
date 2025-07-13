
package P0002_AddTwoNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        String numOne = String.valueOf(num1);

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        String numTwo = String.valueOf(num2);

        ListNode numberOne = new ListNode();
        ListNode oneHead = numberOne;
        ListNode numberTwo = new ListNode();
        ListNode twoHead = numberTwo;

        for (int i = 0; i <= numOne.length() - 1; i++) {
            numberOne.val = Integer.parseInt(String.valueOf(numOne.charAt(i)));
            if (i < numOne.length() - 1) {
                numberOne.next = new ListNode();
                numberOne = numberOne.next;
            }
        }

        for (int i = 0; i <= numTwo.length() - 1; i++) {
            numberTwo.val = Integer.parseInt(String.valueOf(numTwo.charAt(i)));
            if (i < numOne.length() - 1) {
                numberTwo.next = new ListNode();
                numberTwo = numberTwo.next;
            }
        }

        ListNode result = solution.addTwoNumbers(oneHead, twoHead);

        System.out.print("Result: ");

        printNum(result);

    }

    public static void printNum(ListNode head) {

        if (head == null) {
            return;
        }

        System.out.print(head.val);
        printNum(head.next);
    }
}
