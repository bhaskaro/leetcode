/**
 *
 */
package com.oggu.lc.easy;

import java.util.*;

/**
 * @author Bhaskar
 *
 */
public class IntersectionOfTwoArraysII {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " ---- intersection is : "
                + Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " ---- intersection is : "
                + Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> nums1set = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        for (int ele : nums1)
            nums1set.put(ele, nums1set.getOrDefault(ele, 0) + 1);

        for (int ele : nums2)
            if (nums1set.getOrDefault(ele, 0) > 0) {
                results.add(ele);
                nums1set.put(ele, nums1set.get(ele) - 1);
            }

        int[] out = new int[results.size()];

        for (int i = 0; i < results.size(); i++)
            out[i] = results.get(i);

        return out;
    }

}
