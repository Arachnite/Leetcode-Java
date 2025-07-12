
package P0035_SearchInsertPosition;

public class Solution {

    public int searchInsert(int[] nums, int target) {

        if (nums[0] >= target) return 0;

        if (nums[nums.length - 1] < target) return nums.length;

        for (int i = 1; i <= nums.length - 1; i++) {

            if (nums[i] == target) {

                return i;

            } else if (nums[i - 1] < target && target < nums[i]) {

                return i;

            }
        }

        return 0;
    }
}
