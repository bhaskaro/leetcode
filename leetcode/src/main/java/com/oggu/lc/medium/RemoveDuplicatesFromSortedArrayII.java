package com.oggu.lc.medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println("Before removing duplicates : " + Arrays.toString(nums));
        System.out.println(removeDuplicates(nums) + " w/ end indx After removing duplicates : " + Arrays.toString(nums));

        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println("Before removing duplicates : " + Arrays.toString(nums));
        System.out.println(removeDuplicates(nums) + " w/ end indx After removing duplicates : " + Arrays.toString(nums));

        nums = new int[]{1, 1, 2, 2, 3};
        System.out.println("Before removing duplicates : " + Arrays.toString(nums));
        System.out.println(removeDuplicates(nums) + " w/ end indx After removing duplicates : " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1)
            return 1;

        int insrtIdx = 0;
        int endIdx = 0;

        while (endIdx < nums.length - 1) {

            int ctr = 1;
            while (endIdx < nums.length - 1 && nums[endIdx] == nums[endIdx + 1]) {
                endIdx++;
                ctr++;
            }

            nums[insrtIdx++] = nums[endIdx];

            if (ctr >= 2)
                nums[insrtIdx++] = nums[endIdx];

            endIdx++;

            if (endIdx == nums.length - 1)
                if (nums[endIdx - 1] != nums[endIdx])
                    nums[insrtIdx++] = nums[endIdx];
        }

        return insrtIdx;
    }
}
