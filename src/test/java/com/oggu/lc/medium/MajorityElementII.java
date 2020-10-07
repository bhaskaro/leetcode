package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int[] nums = new int[]{3, 2, 3};
        logger.info("{} majorityElement : {}", Arrays.toString(nums), majorityElement(nums));

        nums = new int[]{1};
        logger.info("{} majorityElement : {}", Arrays.toString(nums), majorityElement(nums));

        nums = new int[]{1, 2};
        logger.info("{} majorityElement : {}", Arrays.toString(nums), majorityElement(nums));

        nums = new int[]{3, 3, 4};
        logger.info("{} majorityElement : {}", Arrays.toString(nums), majorityElement(nums));

        nums = new int[]{2, 2, 1, 3};
        logger.info("{} majorityElement : {}", Arrays.toString(nums), majorityElement(nums));

        nums = new int[]{1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1};
        logger.info("{} majorityElement : {}", Arrays.toString(nums), majorityElement(nums));
    }


    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int len = nums.length;

        if (len <= 2) {

            if (len == 1) {
                list.add(nums[0]);
            } else if (len == 2 && nums[0] != nums[1]) {
                list.add(nums[0]);
                list.add(nums[1]);
            } else if (len == 2) {
                list.add(nums[0]);
            }
            return list;
        }

        Arrays.sort(nums);
        int idx = -1;
        int n = len / 3;

        while (++idx < len) {

            int left = idx;
            int ctr = 1;

            while (idx < len - 1 && nums[idx] == nums[idx + 1]) {
                ctr++;
                idx++;
            }

            if (ctr > n) list.add(nums[left]);
        }

        return list;
    }

}
