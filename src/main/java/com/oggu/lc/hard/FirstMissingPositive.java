package com.oggu.lc.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 0};
        System.out.println(Arrays.toString(nums) + " -- firstMissingPositive : " + firstMissingPositiveNew(nums));

        nums = new int[]{3, 4, -1, 1};
        System.out.println(Arrays.toString(nums) + " -- firstMissingPositive : " + firstMissingPositiveNew(nums));

        nums = new int[]{7, 8, 9, 11, 12};
        System.out.println(Arrays.toString(nums) + " -- firstMissingPositive : " + firstMissingPositiveNew(nums));

        nums = new int[]{1};
        System.out.println(Arrays.toString(nums) + " -- firstMissingPositive : " + firstMissingPositiveNew(nums));

        nums = new int[]{1, 2, 0};
        System.out.println(Arrays.toString(nums) + " -- firstMissingPositive : " + firstMissingPositiveNew(nums));

        nums = new int[]{1, 1};
        System.out.println(Arrays.toString(nums) + " -- firstMissingPositive : " + firstMissingPositiveNew(nums));
    }


    public static int firstMissingPositiveNew(int[] nums) {

        if (nums == null || nums.length == 0)
            return 1;

        int len = nums.length;
        int lenpone = nums.length + 1;

        for (int i = 0; i < len; i++)
            if (nums[i] <= 0 || nums[i] > len)
                nums[i] = lenpone;

        for (int i = 0; i < len; i++)
            if (Math.abs(nums[i]) != lenpone && nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * -1;

        for (int i = 1; i <= len; i++)
            if (nums[i - 1] > 0) return i;

        return lenpone;
    }

    public static int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0)
            return 1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums)
            if (i <= nums.length)
                map.put(i, map.getOrDefault(i, 0) + 1);

        int i = 0;
        while (i < nums.length)
            if (map.get(++i) == null)
                return i;

        return i == nums.length ? i + 1 : i;
    }
}
