package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/**
 * @author Bhaskar
 */
public class SingleNumberIII {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] out = singleNumber(nums);
        logger.info("{} -- singleNumber : {}", Arrays.toString(nums), Arrays.toString(out));

        nums = new int[]{-1, 0};
        out = singleNumber(nums);
        logger.info("{} -- singleNumber : {}", Arrays.toString(nums), Arrays.toString(out));

        nums = new int[]{0, 1};
        out = singleNumber(nums);
        logger.info("{} -- singleNumber : {}", Arrays.toString(nums), Arrays.toString(out));

        nums = new int[]{0, 1, 1, 2};
        out = singleNumber(nums);
        logger.info("{} -- singleNumber : {}", Arrays.toString(nums), Arrays.toString(out));
    }

    public static int[] singleNumber(int[] nums) {

        Arrays.sort(nums);
        int[] out = new int[2];
        int x = 0;

        for (int i = 0; i < nums.length; i++)
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
            else out[x++] = nums[i];

        return out;
    }
}
