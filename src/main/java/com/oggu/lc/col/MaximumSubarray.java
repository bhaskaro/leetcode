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
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("maxSubArray : " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int left = 0;
        int right = left + 1;
        int len = nums.length;
        int sum = nums[left];
        int max = sum;

        while (right < len - 1) {

            System.out.println((sum + nums[right]) + " ============= " + sum);
            if (sum + nums[right + 1] > sum) {
                sum = sum + nums[right++];

                if (max < sum) {
                    max = sum;
                }
                System.out.println(max + " ---- " + sum);
            } else {
                sum = sum - nums[left];
                left++;
                right = left + 1;
                // sum = sum + nums[right];
                System.out.println("resetting left -------------- " + left + ", " + right);
            }
        }

        return max;
    }

}
