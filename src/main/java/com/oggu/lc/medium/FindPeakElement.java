package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class FindPeakElement {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 1};
        logger.info("findPeakElement index of : {} is {}", Arrays.toString(nums), findPeakElement(nums));

        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        logger.info("findPeakElement index of : {} is {}", Arrays.toString(nums), findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {

        if (nums.length == 1)
            return 0;

        for (int i = 0; i < nums.length; i++)
            if (i == 0 && nums[i] > nums[i + 1]) return i;
            else if (i == nums.length - 1 && nums[i] > nums[i - 1]) return i;
            else if (i > 0 && i < nums.length - 1 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;

        return -1;
    }
}
