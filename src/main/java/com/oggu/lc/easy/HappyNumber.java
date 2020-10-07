package com.oggu.lc.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 *
 * @author Bhaskar
 */
public class HappyNumber {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int num = 19;
        logger.info("{} isHappy : {}", num, isHappy(num));
    }

    public static boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n > 1) {

            int sqr = getSquare(n);

            if (set.contains(sqr))
                break;
            else
                set.add(sqr);
            n = sqr;
        }
        return n == 1;
    }

    private static int getSquare(int n) {

        if (n < 10) return n * n;
        else return ((n % 10) * (n % 10)) + getSquare(n / 10);
    }
}
