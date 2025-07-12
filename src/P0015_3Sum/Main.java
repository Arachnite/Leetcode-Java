
package P0015_3Sum;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = sc.nextInt();

        int[] nums = new int[length];
        for (int i = 0; i <= length - 1; i++) {

            System.out.print("Enter the element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

        }

        List<List<Integer>> ans = solution.threeSum(nums);
        for (int i = 0; i <= ans.size() - 1; i++) {

            System.out.print("[" + ans.get(i).get(0) + ", " + ans.get(i).get(1) + ", " + ans.get(i).get(2) + "]");
            System.out.println();

        }
    }
}
