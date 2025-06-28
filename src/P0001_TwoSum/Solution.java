
package P0001_TwoSum;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] returnArray = new int[2];

        for (int i = 0; i <= nums.length - 2; i++) {
            for (int ii = i + 1; ii <= nums.length - 1; ii++) {
                if (nums[i] + nums[ii] == target) {
                    returnArray[0] = i;
                    returnArray[1] = ii;
                    return returnArray;
                }
            }
        }

        return returnArray;
    }
}