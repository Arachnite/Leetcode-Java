
package P0027_RemoveElement;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int index = 0;

        for (int i = 0; i <= nums.length - 1; i++) {

            if (nums[i] != val) {

                nums[index] = nums[i];
                index++;

            }
        }

        return index;
    }
}
