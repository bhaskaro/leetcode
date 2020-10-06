/**
 *
 */
package com.oggu.lc.col;

/**
 * https://leetcode.com/problems/maximum-subarray/ <br>
 * <br>
 * <b>53. Maximum Subarray</b><br>
 *
 * <pre>
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 *
 * Follow up: If you have figured out the O(n) solution, try coding another
 * solution using the divide and conquer approach, which is more subtle.
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class MaximumSubarray {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("maxSubArray : " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int tot = 0;

        for (int num : nums) {
            tot += num;
            max = Math.max(max, tot);
            tot = Math.max(tot, 0);
        }

        return max;
    }

}
