/**
 *
 */
package com.oggu.lc.easy;

/**
 * @author Bhaskar
 *
 */
public class ContainsDuplicateII {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        System.out.println("containsNearbyDuplicate : " + containsNearbyDuplicate(nums, k));

        nums = new int[]{1, 0, 1, 1};
        k = 1;
        System.out.println("containsNearbyDuplicate : " + containsNearbyDuplicate(nums, k));

        nums = new int[]{1, 2, 3, 1, 2, 3};
        k = 2;
        System.out.println("containsNearbyDuplicate : " + containsNearbyDuplicate(nums, k));

        nums = new int[]{99, 99};
        k = 2;
        System.out.println("containsNearbyDuplicate : " + containsNearbyDuplicate(nums, k));

        nums = new int[]{2, 2};
        k = 3;
        System.out.println("containsNearbyDuplicate : " + containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length <= 1)
            return false;

        int length = nums.length;

        for (int i = 0; i < length; i++) {

            int temp = i + 1;

            while (temp < length && temp <= i + k)
                if (nums[i] == nums[temp++])
                    return true;
        }

        return false;
    }

    public boolean containsNearbyDuplicateOld(int[] nums, int k) {

        if (nums == null || nums.length <= 1)
            return false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

}
