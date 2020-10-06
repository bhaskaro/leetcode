package com.oggu.lc.medium;

/**
 * https://leetcode.com/problems/multiply-strings/
 */
public class MultiplyStrings {

    public static void main(String... args) {

        String num1 = "2320", num2 = "3256";

        System.out.println(num1 + " * " + num2 + " multiply : " + multiply(num1, num2));
        System.out.println("Actual : " + (Integer.parseInt(num1) * Integer.parseInt(num2)));
    }

    public static String multiply(String num1, String num2) {

        char[] num1chars = num1.toCharArray();
        char[] num2chars = num2.toCharArray();

        int[] out = new int[num1chars.length + num2chars.length];

        int length = out.length - 1;
        int idx = 0;

        for (int i = num1chars.length - 1; i >= 0; i--) {

            int rem = 0;
            int x = idx;

            for (int j = num2chars.length - 1; j >= 0; j--) {

                int temp = out[length - x] + rem + (Character.getNumericValue(num1chars[i]) * Character.getNumericValue(num2chars[j]));
                rem = temp / 10;
                temp = temp % 10;
                out[length - x] = temp;

                if (rem > 0)
                    out[length - x - 1] = out[length - x - 1] + rem;
                rem = 0;
                x++;
            }

            idx++;
        }

        int i = 0;
        while (i < out.length && out[i] == 0)
            i++;

        StringBuilder sb = new StringBuilder();

        for (; i < out.length; i++)
            sb.append(out[i]);

        return sb.length() > 0 ? sb.toString() : "0";
    }

}
