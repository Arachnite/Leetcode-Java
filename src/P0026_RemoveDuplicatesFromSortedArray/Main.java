
package P0026_RemoveDuplicatesFromSortedArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to use: ");
        int length = sc.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i <= nums.length - 1; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

        }

        length = solution.removeDuplicates(nums);

        System.out.print("New array: ");
        for (int i = 0; i < length; i++) {

            System.out.print(nums[i] + ", ");

        }
    }
}
