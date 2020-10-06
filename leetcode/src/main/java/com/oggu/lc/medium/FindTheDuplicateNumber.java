package com.oggu.lc.medium;

import java.util.Arrays;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 4, 2, 2};
        System.out.println(Arrays.toString(nums) + " -- findDuplicate: " + findDuplicate(nums));

        nums = new int[]{3, 1, 3, 4, 2};
        System.out.println(Arrays.toString(nums) + " -- findDuplicate: " + findDuplicate(nums));

        nums = new int[]{1, 1};
        System.out.println(Arrays.toString(nums) + " -- findDuplicate: " + findDuplicate(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(Arrays.toString(nums) + " -- findDuplicate: " + findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            if (nums[Math.abs(nums[i]) - 1] < 0) return Math.abs(nums[i]);
            else nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * -1;
        return -1;
    }
}
