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

    public static int[] productExceptSelfNew(int[] nums) {
        /*
        1) find the left array by just multiplying all the values with product variable
        2) use the same product variable to keep track of right array by doing the opposite.
        TIME : O(N)
        SPACE : O(1)
        */
        int n = nums.length;
        int[] output = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            product *= nums[i];
            output[i] = product;
        }
        product = 1; // right array
        for (int i = n - 1; i > 0; i--) {
            output[i] = output[i - 1] * product;
            product *= nums[i];
        }
        output[0] = product;
        return output;

    }

}
