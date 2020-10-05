package com.oggu.lc.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bhaskar
 */
public class FindAllDuplicatesInAnArray {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(nums) + " findDuplicates : " + findDuplicates(nums));

        nums = new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7};
        System.out.println(Arrays.toString(nums) + " findDuplicates : " + findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i] > 0 ? nums[i] : nums[i] * -1;

            if (nums[x - 1] >= 0)
                nums[x - 1] *= -1;
            else
                list.add(x);
        }

        return list;
    }
}
