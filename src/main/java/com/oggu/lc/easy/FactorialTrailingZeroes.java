package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/ <br>
 * <br>
 * 172. Factorial Trailing Zeroes <br>
 * <p>
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * @author Bhaskar
 */
public class FactorialTrailingZeroes {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int n = 5;
        System.out.println(n + " factoriral trailingZeroes : " + trailingZeroes(n));

        n = 9;
        System.out.println(n + " factoriral trailingZeroes : " + trailingZeroes(n));

        n = 13;
        System.out.println(n + " factoriral trailingZeroes : " + trailingZeroes(n));

        n = 30;
        System.out.println(n + " factoriral trailingZeroes : " + trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {

        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

}
