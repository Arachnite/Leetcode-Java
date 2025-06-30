
package P0001_TwoSum;

import java.util.Scanner;

public class TwoSumMain {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        int length = 0;
        int target = 0;
        boolean inValidInput = true;


        while (inValidInput) {
            System.out.print("Enter the number of elements in the array: ");
            try {
                length = sc.nextInt();
                inValidInput = false;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); // Clear the invalid input
            }
        }
        int[] nums = new int[length];

        for (int i = 0; i <= nums.length - 1; i++) {

            inValidInput = true;
            while (inValidInput) {
                System.out.print("Enter number " + (i + 1) + ": ");
                try {
                    nums[i] = sc.nextInt();
                    inValidInput = false;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine(); // Clear the invalid input
                }
            }
        }

        inValidInput = true;
        while (inValidInput) {
                System.out.print("Enter target number: ");
                try {
                    target = sc.nextInt();
                    inValidInput = false;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine(); // Clear the invalid input
                }
            }

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to " + target + ": [" + (result[0] + 1) + ", " + (result[1] + 1) + "]");

        sc.close();
    }
}
