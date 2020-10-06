/**
 *
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author Bhaskar
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));

        nums = new int[]{1, 1, 2};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));

        nums = new int[]{1, 1};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));

        nums = new int[]{1, 2};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));

        nums = new int[]{1, 2, 2};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1)
            return 1;

        int x = 0;
        int idx = 0;

        while (idx < nums.length - 1) {

            if (nums[idx] != nums[idx + 1]) nums[x++] = nums[idx++];
            else idx++;

            if (idx == nums.length - 1) nums[x++] = nums[idx++];
        }

        return x;
    }
}
