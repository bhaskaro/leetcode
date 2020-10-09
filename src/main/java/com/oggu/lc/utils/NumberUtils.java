package com.oggu.lc.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Bhaskar
 */
public class NumberUtils {

    private static final Random random = new SecureRandom();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(randomNums(10)));
        System.out.println(Arrays.toString(randomNumsSorted(10)));
    }

    public static int[] randomNums(int len) {

        int[] out = new int[len];

        for (int i = 0; i < len; i++) {
            out[i] = random.nextInt(len * 10);
        }

        return out;
    }

    public static int[] randomNumsSorted(int len) {

        int[] out = randomNums(len);

        Arrays.sort(out);

        return out;
    }

    public static int[] uniqRandomNumsSorted(int len) {

        int[] out = uniqRandomNums(len);

        Arrays.sort(out);

        return out;
    }

    public static int[] uniqRandomNums(int len) {

        int[] out = new int[len];

        List<Integer> intList = new ArrayList<>(len);

        for (int i = 0; i < len * 2; i++)
            intList.add(i);


        for (int i = 0; i < len; i++) {
            out[i] = intList.remove(random.nextInt(intList.size()));
        }

        return out;
    }
}
