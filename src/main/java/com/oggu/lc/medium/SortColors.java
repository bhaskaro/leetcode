package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortColors {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        logger.info("Before sortColors : {}", Arrays.toString(nums));
        sortColors(nums);
        logger.info("After sortColors : {}", Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {

        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right)
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid++] = nums[left];
                nums[left++] = temp;
            } else if (nums[mid] == 1)
                mid++;
            else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right--] = temp;
            }
    }
}
