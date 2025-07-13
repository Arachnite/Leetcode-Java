
package P0004_MedianOfTwoSortedArrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int index1; int index2;
        double result1 = 0; double result2 = 0;

        if ((nums1.length != 0)) {
            if (nums1.length % 2 == 1) {

                index1 = (int)((nums1.length / 2) + 0.5);
                result1 = nums1[index1];

            } else {

                index1 = (nums1.length / 2);
                if (index1 == 0) {
                    result1 = nums1[0];
                } else {
                    result1 = (nums1[index1 - 1] + nums1[index1]) / 2.0;
                }
            }
        }

        if ((nums2.length != 0)) {
            if (nums2.length % 2 == 1) {

                index2 = (int)((nums2.length / 2) + 0.5);
                result2 = nums2[index2];

            } else {

                index2 = (nums2.length / 2);
                if (index2 == 0) {
                    result2 = nums2[0];
                } else {
                    result2 = (nums2[index2 - 1] + nums2[index2]) / 2.0;
                }
            }
        }

        if (result1 == 0 && result2 == 0) {
            return 0;
        } else if (result1 == 0) {
            return result2;
        } else if (result2 == 0) {
            return result1;
        } else {
            return (result1 + result2) / 2.0;
        }
    }
}
