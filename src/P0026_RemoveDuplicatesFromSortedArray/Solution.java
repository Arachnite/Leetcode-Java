
package P0026_RemoveDuplicatesFromSortedArray;

public class Solution {

    public int removeDuplicates(int[] nums) {

        int index = 1;
        for (int i = 1; i <= nums.length - 1; i++) {

            if (nums[i - 1] != nums[i]) {

                nums[index] = nums[i];
                index++;

            }
        }

        return index;
    }
}
