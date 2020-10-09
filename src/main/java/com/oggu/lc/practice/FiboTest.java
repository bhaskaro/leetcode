package com.oggu.lc.practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FiboTest {

    static int[] nums = null;
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int n = 5;
        logger.info("getFibRecur of {} is {}", n, getFibRecur(n));
        logger.info("getFibDyno of {} is {}", n, getFibDyno(n));
    }

    public static int getFibRecur(int n) {

        if (n == 0 || n == 1)
            return 1;

        return getFibRecur(n - 1) + getFibRecur(n - 2);
    }

    public static int getFibDyno(int n) {

        if (nums == null)
            nums = new int[n + 1];

        if (n == 0 || n == 1)
            return 1;
        else if (nums[n] == 0)
            nums[n] = getFibDyno(n - 1) + getFibDyno(n - 2);

        return nums[n];
    }
}
