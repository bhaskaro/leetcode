/**
 *
 */
package com.oggu.lc.practice;

import java.util.Arrays;

/**
 * @author Bhaskar
 *
 */
public class MergeSortedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        System.out.println("Merging : " + Arrays.toString(nums1) + ", and " + Arrays.toString(nums2));
        merge(nums1, m, nums2, n);
        System.out.println("merge : " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int x = nums1.length;

        while (m > 0 || n > 0) {

            if (m > 0 && n > 0) {

                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[--x] = nums1[--m];
                } else {
                    nums1[--x] = nums2[--n];
                }
            } else if (m > 0) {
                nums1[--x] = nums1[--m];
            } else {
                nums1[--x] = nums2[--n];
            }
        }
    }

    public void mergeOld(int[] nums1, int m, int[] nums2, int n) {

        int x = nums1.length - 1;

        int lm = m - 1;
        int ln = n - 1;

        while (lm >= 0 && ln >= 0)
            if (nums1[lm] > nums2[ln]) {
                nums1[x--] = nums1[lm--];
            } else {
                nums1[x--] = nums2[ln--];
            }

        while (lm >= 0)
            nums1[x--] = nums1[lm--];

        while (ln >= 0)
            nums1[x--] = nums2[ln--];
    }
}
