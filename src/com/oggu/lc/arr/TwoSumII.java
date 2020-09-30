/**
 *
 */
package com.oggu.lc.arr;

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

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(numbers) + ", target " + target + " --  twoSum : "
                + Arrays.toString(twoSum(numbers, target)));
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

    public int[] twoSumOld(int[] numbers, int target) {

        int[] out = {-1, -1};

        if (numbers == null || numbers.length < 2) {
            return out;
        }

        int left = 1;
        int right = numbers.length;

        while (right <= numbers.length) {

            if (numbers[left - 1] + numbers[right - 1] < target) {
                left++;
            } else if (numbers[left - 1] + numbers[right - 1] > target) {
                right--;
            } else {
                out[0] = left;
                out[1] = right;
                break;
            }

        }

        return out;
    }
}
