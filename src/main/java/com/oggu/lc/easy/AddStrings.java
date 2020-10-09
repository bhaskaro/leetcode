package com.oggu.lc.easy;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Bhaskar
 */
public class AddStrings {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        Random random = new SecureRandom();

        String num1 = String.valueOf(random.nextInt(10000));
        String num2 = String.valueOf(random.nextInt(10000));
        System.out.println(num1 + " + " + num2 + " = " + addStrings(num1, num2));
        System.out.println(num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
    }

    public static String addStrings(String num1, String num2) {

        char[] num1chars = num1.toCharArray();
        char[] num2chars = num2.toCharArray();

        int num1len = num1chars.length;
        int num2len = num2chars.length;

        int maxLen = Math.max(num1len, num2len);
        int rem = 0;

        StringBuilder sb = new StringBuilder(maxLen + 1);

        while (maxLen-- > 0) {

            int temp = rem;

            if (num1len-- > 0)
                temp = temp + Character.getNumericValue(num1chars[num1len]);

            if (num2len-- > 0)
                temp = temp + Character.getNumericValue(num2chars[num2len]);

            if (temp > 9)
                rem = temp / 10;
            else
                rem = 0;

            sb.append(temp % 10);
        }

        if (rem > 0)
            sb.append(rem);

        return sb.reverse().toString();
    }

}
