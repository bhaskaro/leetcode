/**
 *
 */
package com.oggu.lc.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * @author Bhaskar
 *
 */
public class FindAllNumbersDisappearedInAnArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(nums) + " missing nums : " + findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for (int i : nums) {

            if (i < 0)
                i *= -1;

            if (nums[i - 1] > 0)
                nums[i - 1] = nums[i - 1] * -1;
        }

        List<Integer> list = new ArrayList<Integer>(2);

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                list.add(i + 1);

        return list;
    }
}
