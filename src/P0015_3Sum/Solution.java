
package P0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    //-1, 0, 1, 2, -1, -4
    //-4, -1, -1, 0, 1, 2

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {

                continue;

            }

            int ii = i + 1;
            int iii = nums.length - 1;

             while (ii < iii) {
                int sum = nums[i] + nums[ii] + nums[iii];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[ii], nums[iii]));


                    while (ii < iii && nums[ii] == nums[ii + 1]) {

                        ii++;

                    }

                    while (ii < iii && nums[iii] == nums[iii - 1]) {

                        iii--;

                    }

                    ii++;
                    iii--;

                } else if (sum < 0) {

                    ii++;

                } else {

                    iii--;

                }
            }
        }

        return ans;
    }
}
