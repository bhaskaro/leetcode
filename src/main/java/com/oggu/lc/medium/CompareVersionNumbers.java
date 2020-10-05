package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompareVersionNumbers {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        String version1 = "1.01";
        String version2 = "1.001";
        logger.info("compareVersion of {}, {} : {}", version1, version2, compareVersion(version1, version2));

        version1 = "1.0";
        version2 = "1.0.0";
        logger.info("compareVersion of {}, {} : {}", version1, version2, compareVersion(version1, version2));

        version1 = "0.1";
        version2 = "1.1";
        logger.info("compareVersion of {}, {} : {}", version1, version2, compareVersion(version1, version2));

        version1 = "1.0.1";
        version2 = "1";
        logger.info("compareVersion of {}, {} : {}", version1, version2, compareVersion(version1, version2));

        version1 = "7.5.2.4";
        version2 = "7.5.3";
        logger.info("compareVersion of {}, {} : {}", version1, version2, compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {

        int leftv1 = 0;
        int leftv2 = 0;

        while (leftv1 < version1.length() || leftv2 < version2.length()) {

            int idx1 = leftv1;
            int ver1 = 0;

            int idx2 = leftv2;
            int ver2 = 0;

            if (leftv1 < version1.length()) {
                while (leftv1 < version1.length() && version1.charAt(leftv1) != '.') leftv1++;

                ver1 = Integer.parseInt(version1.substring(idx1, leftv1));
            }

            if (leftv2 < version2.length()) {
                while (leftv2 < version2.length() && version2.charAt(leftv2) != '.') leftv2++;

                ver2 = Integer.parseInt(version2.substring(idx2, leftv2));
            }

            if (ver1 < ver2) return -1;
            else if (ver1 > ver2) return 1;

            leftv1++;
            leftv2++;
        }

        return 0;
    }

}
