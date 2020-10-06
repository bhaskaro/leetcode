/**
 *
 */
package com.oggu.lc.easy;

/**
 * @author Bhaskar
 *
 */
public class PowerOfThree {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 27;
        System.out.println(n + " isPowerOfThree : " + isPowerOfThree(n));

        n = 0;
        System.out.println(n + " isPowerOfThree : " + isPowerOfThree(n));

        n = 9;
        System.out.println(n + " isPowerOfThree : " + isPowerOfThree(n));

        n = 45;
        System.out.println(n + " isPowerOfThree : " + isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {

        if (n == 0)
            return false;

        while (n % 3 == 0)
            n = n / 3;

        return n == 1;
    }

}
