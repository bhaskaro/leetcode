package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseWordsInAString {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        String s = "   the    sky    is blue   ";
        logger.info("'{}' reversed is '{}'", s, reverseWords(s));
    }

    public static String reverseWords(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length;

        StringBuilder sb = new StringBuilder(chars.length);

        //trim left and right empty spaces
        while (left < right && chars[left] == ' ') left++;
        while (right - 1 >= 0 && chars[right - 1] == ' ') right--;

        while (left < right) {

            int wordBeginIdx = left;

            while (left < right && chars[left] != ' ') left++;

            sb.insert(0, chars, wordBeginIdx, left - wordBeginIdx);

            while (left < right && chars[left] == ' ') left++;

            if (left < right) sb.insert(0, ' ');
        }

        return sb.toString();
    }
}
