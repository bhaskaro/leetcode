package com.oggu.lc.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberComplement {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        int num = 5;
        logger.info("findComplement of {} is {}", num, findComplement(num));

        num = 1;
        logger.info("findComplement of {} is {}", num, findComplement(num));
    }

    public static int findComplement(int num) {

        int i = 0;
        double out = 0;

        while (num > 0) {
            out = out + (Math.pow(2, i++) * (num % 2 == 0 ? 1 : 0));
            num = num >> 1;
        }
        return (int) out;
    }

}
