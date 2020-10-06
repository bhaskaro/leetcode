package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Bhaskar
 */
public class SingleNumberII {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{2, 2, 3, 2};
        logger.info("{} -- singleNumber : {}", Arrays.toString(nums), singleNumber(nums));

        nums = new int[]{0, 1, 0, 1, 0, 1, 99};
        logger.info("{} -- singleNumber : {}", Arrays.toString(nums), singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length - 1)
            if (nums[i] == nums[i + 1]) i += 3;
            else return nums[i];

        return nums[nums.length - 1];
    }


    public static int[] singleNumberWithSet(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            if (set.contains(i)) set.remove(i);
            else set.add(i);

        Integer[] array = set.toArray(new Integer[0]);

        return new int[]{array[0], array[1]};
    }

    public int singleNumberBitManipulation(int[] nums) {
        // This problem can be translated to:
        //      For every bit position, we cancel any 3-time 1 and 3-time 0 to a 0
        //      Then we need to find equations that fits this: (assume we apply 3 1s)
        //               Zero 1      First 1     Second 1    Third 1
        // seenOnce        0            1           0           0
        // seenTwice       0            0           1           0
        int seenOnce = 0;
        int seenTwice = 0;

        for (int num : nums) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }

}
