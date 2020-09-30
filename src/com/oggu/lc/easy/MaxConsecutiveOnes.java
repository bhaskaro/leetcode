/**
 *
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 *
 * @author Bhaskar
 *
 */
public class MaxConsecutiveOnes {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(Arrays.toString(nums) + " --- findMaxConsecutiveOnes : " + findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0, length = nums.length;

        for (int i = 0; i < length; i++) {

            int temp = 0;

            while (i < length && nums[i] == 1) {
                i++;
                temp++;
            }

            max = temp > max ? temp : max;
        }

        return max;
    }

}
