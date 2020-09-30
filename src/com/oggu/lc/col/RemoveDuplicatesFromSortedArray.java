/**
 *
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * @author Bhaskar
 *
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("removeDuplicates : " + removeDuplicates(nums) + " --- " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums == null)
            return 0;

        int out = 1;

        int lIdx = 0;
        int rIdx = 1;

        while (rIdx < nums.length) {

            if (nums[lIdx] != nums[rIdx]) {
                out++;
                System.out.println(lIdx + "----" + rIdx);

                if (rIdx > lIdx + 1) {
                    nums[++lIdx] = nums[rIdx++];
                } else {
                    lIdx++;
                    rIdx++;
                }
            } else {
                rIdx++;
            }
        }

        return out;
    }

    public int removeDuplicatesOld(int[] nums) {

        int dups = 0;
        int length = nums.length;
        int ptr = 0;

        for (int i = 0; i < length - 1; i++) {

            while (i < length - 1 && nums[i] == nums[i + 1]) {
                i++;
                dups++;
            }

            nums[ptr++] = nums[i];
            if (i == length - 2) {
                nums[ptr++] = nums[i + 1];
                i++;
            }
        }
        return length - dups;
    }

    // 26. Remove Duplicates from Sorted Array
    public int removeDuplicates26(int[] nums) {

        if (nums == null)
            return 0;

        int out = 1;

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] != nums[i + 1])
                out++;

        return out;
    }

}
