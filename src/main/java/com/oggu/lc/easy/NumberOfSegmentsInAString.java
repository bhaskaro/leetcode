package com.oggu.lc.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberOfSegmentsInAString {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        String s = "Hello, my name is John";
        logger.info("countSegments of {} is {}", s, countSegments(s));

        s = "Hello";
        logger.info("countSegments of {} is {}", s, countSegments(s));

        s = "love live! mu'sic forever";
        logger.info("countSegments of {} is {}", s, countSegments(s));

        s = "";
        logger.info("countSegments of {} is {}", s, countSegments(s));

        s = ", , , ,        a, eaefa";
        logger.info("countSegments of {} is {}", s, countSegments(s));
    }

    public static int countSegments(String s) {

        int left = 0;
        int right = s.length();
        int ctr = 0;

        while (left < right) {

            while (left < right && s.charAt(left) == ' ') left++;
            int idx = left;
            while (left < right && s.charAt(left) != ' ') left++;
            if (idx < left) ctr++;
        }

        return ctr;
    }

}
