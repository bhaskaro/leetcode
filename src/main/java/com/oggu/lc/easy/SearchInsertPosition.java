package com.oggu.lc.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/search-insert-position/ <br>
 * <br>
 * 35. Search Insert Position<br>
 *
 * <pre>
 * Given a sorted array and a target value, return
 * the index if the target is found. If not, return the index where it would be
 * if it were inserted in order.
 * </pre>
 *
 * @author Bhaskar
 */
public class SearchInsertPosition {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        int insrtIdx = searchInsert(nums, target);
        logger.info("{} can be inserted at searchInsert : {} for {}", target, insrtIdx, Arrays.toString(nums));

        target = 2;
        insrtIdx = searchInsert(nums, target);
        logger.info("{} can be inserted at searchInsert : {} for {}", target, insrtIdx, Arrays.toString(nums));

        target = 7;
        insrtIdx = searchInsert(nums, target);
        logger.info("{} can be inserted at searchInsert : {} for {}", target, insrtIdx, Arrays.toString(nums));

        target = 0;
        insrtIdx = searchInsert(nums, target);
        logger.info("{} can be inserted at searchInsert : {} for {}", target, insrtIdx, Arrays.toString(nums));

        nums = new int[]{1, 3};
        target = 0;
        insrtIdx = searchInsert(nums, target);
        logger.info("{} can be inserted at searchInsert : {} for {}", target, insrtIdx, Arrays.toString(nums));

        nums = new int[]{1, 2, 4, 6, 7};
        target = 3;
        insrtIdx = searchInsert(nums, target);
        logger.info("{} can be inserted at searchInsert : {} for {}", target, insrtIdx, Arrays.toString(nums));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}
