/**
 *
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/ <br>
 * <br>
 *
 * <pre>
 * Given an array nums and a value val, remove all instances of that value
 * in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 *
 * Example 1:
 *
 * Given nums = [3,2,2,3], val = 3,
 *
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 *
 * It doesn't matter what you leave beyond the returned length.
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class RemoveElement {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        System.out.print(Arrays.toString(nums));
        int removeElement = removeElement(nums, 3);
        System.out.println("  removeElement : " + removeElement + " -- " + Arrays.toString(nums));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.print(Arrays.toString(nums));
        removeElement = removeElement(nums, 2);
        System.out.println("  removeElement : " + removeElement + " -- " + Arrays.toString(nums));

        nums = new int[]{3, 2, 2, 3};
        System.out.print(Arrays.toString(nums));
        removeElement = removeElement(nums, 3);
        System.out.println("  removeElement : " + removeElement + " -- " + Arrays.toString(nums));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.print(Arrays.toString(nums));
        removeElement = removeElement(nums, 2);
        System.out.println("  removeElement : " + removeElement + " -- " + Arrays.toString(nums));

        nums = new int[]{4, 5};
        System.out.print(Arrays.toString(nums));
        removeElement = removeElement(nums, 4);
        System.out.println("  removeElement : " + removeElement + " -- " + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {

        if (nums.length == 1) return nums[0] == val ? 0 : 1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            while (left <= right && nums[left] != val) left++;
            while (left <= right && nums[right] == val) right--;

            //swap elements
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return left;
    }
}
