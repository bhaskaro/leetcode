/**
 *
 */
package com.oggu.lc.easy;

/**
 * @author Bhaskar
 *
 */
public class ValidPerfectSquare {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int num = 16;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 4;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 9;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 5;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 6;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 250000;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 14;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));

        num = 2147395600;
        System.out.println(num + " isPerfectSquare : " + isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {

        if (num == 0 || num == 1 || num == 4)
            return true;
        else if (num <= 4)
            return false;

        long left = 1;
        long right = num / 2;

        while (left < right) {

            long mid = (left + right) / 2;

            System.out.println(left + " ----  " + right);

            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                left = mid + 1;
            else
                right = mid;
        }

        return false;
    }

}
