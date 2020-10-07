package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};
        int[] out = productExceptSelf(nums);
        logger.info("product array of {} is {}", Arrays.toString(nums), out);
    }

    public static int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length <= 1)
            return nums;

        int[] asc = new int[nums.length];
        int[] dsc = new int[nums.length];
        int[] out = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) asc[i] = nums[i];
            else asc[i] = asc[i - 1] * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) dsc[i] = nums[i];
            else dsc[i] = dsc[i + 1] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) out[i] = dsc[i + 1];
            else if (i == nums.length - 1) out[i] = asc[i - 1];
            else out[i] = asc[i - 1] * dsc[i + 1];
        }

        return out;
    }

}
