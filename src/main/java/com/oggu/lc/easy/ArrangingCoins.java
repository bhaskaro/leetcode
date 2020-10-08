package com.oggu.lc.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrangingCoins {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int n = 5;
        logger.info("arrangeCoins of {} is : {}", n, arrangeCoins(n));

        n = 8;
        logger.info("arrangeCoins of {} is : {}", n, arrangeCoins(n));

        n = 5;
        logger.info("arrangeCoinsRecur of {} is : {}", n, arrangeCoinsRecur(n));

        n = 8;
        logger.info("arrangeCoinsRecur of {} is : {}", n, arrangeCoinsRecur(n));
    }

    public static int arrangeCoins(int n) {

        int i = 0;
        while (n > 0)
            if (n >= i + 1) n -= ++i;
            else break;

        return i;
    }

    public static int arrangeCoinsRecur(int n) {

        return count(n, 1);
    }

    private static int count(int n, int i) {

        if (n < i) return 0;

        return 1 + count(n -= i, ++i);
    }

}
