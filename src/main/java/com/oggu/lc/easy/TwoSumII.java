/**
 *
 */
package com.oggu.lc.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ <br>
 * <br>
 * 167. Two Sum II - Input array is sorted <br>
 *
 * <pre>
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based. You may
 * assume that each input would have exactly one solution and you may not use
 * the same element twice.
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class TwoSumII {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        String array1 = Arrays.toString(numbers);
        String array2 = Arrays.toString(twoSum(numbers, target));
        logger.info("{}, target {} --  twoSum : {}", array1, target, array2);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int tot = numbers[left] + numbers[right];

            if (tot == target)
                return new int[]{left + 1, right + 1};
            else if (tot > target)
                right--;
            else
                left++;
        }

        return new int[]{-1, -1};
    }

}
