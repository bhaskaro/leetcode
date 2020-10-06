package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MaximumProductSubarray {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int[] nums = new int[]{2, 3, -2, 4};
        logger.info("{} max proudct is {}", Arrays.toString(nums), maxProduct(nums));

        nums = new int[]{-2, 0, -1};
        logger.info("{} max proudct is {}", Arrays.toString(nums), maxProduct(nums));

        nums = new int[]{-2};
        logger.info("{} max proudct is {}", Arrays.toString(nums), maxProduct(nums));

        nums = new int[]{0, 2};
        logger.info("{} max proudct is {}", Arrays.toString(nums), maxProduct(nums));
    }


    public static int maxProduct(int[] nums) {

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int prod = nums[i];
            if (prod != 0) {

                max = Math.max(max, nums[i]);

                for (int j = i + 1; j < nums.length; j++) {

                    prod *= nums[j];
                    max = Math.max(max, prod);
                    if (prod == 0) break;
                }
            }
        }

        return max;
    }
}
