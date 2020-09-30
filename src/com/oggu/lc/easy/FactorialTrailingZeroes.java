/**
 *
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/ <br>
 * <br>
 * 172. Factorial Trailing Zeroes <br>
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 *
 *
 * @author Bhaskar
 *
 */
public class FactorialTrailingZeroes {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 5;
        System.out.println(n + " factoriral trailingZeroes : " + trailingZeroes(n));

        n = 9;
        System.out.println(n + " factoriral trailingZeroes : " + trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {

        int fact = 1;
        int ctr = 0;

        while (n > 0) {
            fact = fact * n;
            n = n - 1;
        }

        System.out.println("factorial : " + fact);

        while (fact > 0) {

            if (fact % 10 == 0) {
                ctr++;
                fact = fact / 10;
            } else {
                break;
            }
        }

        return ctr;
    }

}
