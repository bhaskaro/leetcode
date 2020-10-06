/**
 *
 */
package com.oggu.lc.easy;

import java.util.*;

/**
 * @author Bhaskar
 *
 */
public class IntersectionOfTwoArrays {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " ---- intersection is : "
                + Arrays.toString(intersection(nums1, nums2)));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(nums1) + ", " + Arrays.toString(nums2) + " ---- intersection is : "
                + Arrays.toString(intersection(nums1, nums2)));

        Set<Integer> nums1set = new HashSet<>();
        Set<Integer> nums2set = new HashSet<>();

        nums1set.add(1);
        nums1set.add(2);
        nums1set.add(3);

        nums2set.add(1);
        nums2set.add(2);
        nums2set.add(4);

        nums1set.retainAll(nums2set);

//		System.out.println("nums1set : " + nums1set);
//		System.out.println("nums2set : " + nums2set);
    }

    public static int[] intersectionNew(int[] nums1, int[] nums2) {

        Set<Integer> nums1set = new HashSet<>();
        Set<Integer> nums2set = new HashSet<>();

        for (Integer integer : nums1)
            nums1set.add(integer);

        for (Integer integer : nums2)
            nums2set.add(integer);

        nums1set.retainAll(nums2set);

        int[] out = new int[nums1set.size()];

        int x = 0;
        for (int i : nums1set)
            out[x++] = i;

        return out;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> nums1set = new HashSet<>();
        List<Integer> results = new LinkedList<>();

        for (Integer integer : nums1)
            nums1set.add(integer);

        for (int i = 0; i < nums2.length && !nums1set.isEmpty(); i++)
            if (nums1set.remove(nums2[i]))
                results.add(nums2[i]);

        int[] out = new int[results.size()];

        for (int i = 0; i < results.size(); i++)
            out[i] = results.get(i);

        return out;
    }
}
