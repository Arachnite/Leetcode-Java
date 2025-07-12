
package P0035_SearchInsertPosition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = sc.nextInt();

        int[] nums = new int[length];
        for (int i = 0; i <= length - 1; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        int result = solution.searchInsert(nums, target);
    }
}
