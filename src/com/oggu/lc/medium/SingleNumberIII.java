/**
 *
 */
package com.oggu.lc.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Bhaskar
 *
 */
public class SingleNumberIII {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(nums) + " -- singleNumber : " + Arrays.toString(singleNumber(nums)));

        nums = new int[]{-1, 0};
        System.out.println(Arrays.toString(nums) + " -- singleNumber : " + Arrays.toString(singleNumber(nums)));

        nums = new int[]{0, 1};
        System.out.println(Arrays.toString(nums) + " -- singleNumber : " + Arrays.toString(singleNumber(nums)));

        nums = new int[]{0, 1, 1, 2};
        System.out.println(Arrays.toString(nums) + " -- singleNumber : " + Arrays.toString(singleNumber(nums)));
    }

    public static int[] singleNumber(int[] nums) {

        Arrays.sort(nums);
        int[] out = new int[2];
        int x = 0;

        for (int i = 0; i < nums.length; i++)
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                i++;
            else
                out[x++] = nums[i];

        return out;
    }

    public static int[] singleNumberOld(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            if (set.contains(i))
                set.remove(i);
            else
                set.add(i);

        Integer[] array = set.stream().toArray(Integer[]::new);

        return new int[]{array[0], array[1]};
    }

}
