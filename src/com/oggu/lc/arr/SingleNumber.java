/**
 *
 */
package com.oggu.lc.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/single-number/ <br>
 * <br>
 * 136. Single Number
 *
 * @author Bhaskar
 *
 */
public class SingleNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {2, 2, 1};
        System.out.println(Arrays.toString(nums) + " -- singleNumber : " + singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(Arrays.toString(nums) + " -- singleNumber : " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }

    public static int singleNumberWithSort(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2)
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) return nums[i];
        return -1;
    }


    public static int singleNumberWithSets(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            if (set.contains(num)) set.remove(num);
            else set.add(num);

        return set.iterator().next();
    }

}
