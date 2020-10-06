package com.oggu.lc.practice;

public class StringTest {

    public static void main(String[] args) {

        int strLen = 1000 * 10 * 10 * 10 * 10 * 10;
        String str = null;
        char[] chars = new char[strLen];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strLen; i++) {
            sb.append((char) i);
        }

        str = sb.toString();
        chars = str.toCharArray();

        System.out.println("str len : " + str.length());
        System.out.println("str len : " + chars.length);

        long old = System.currentTimeMillis();

        for (int x = 0; x < 100; x++) {
            for (int i = 0; i < strLen - 1; i++) {

                if (str.charAt(i) == str.charAt(i + 1)) {
                    return;
                }
            }
        }

        long newT = System.currentTimeMillis();

        System.out.println("time took for str : " + (newT - old));

        old = System.currentTimeMillis();

        for (int x = 0; x < 100; x++) {
            for (int i = 0; i < strLen - 1; i++) {

                if (chars[i] == chars[i + 1]) {
                    return;
                }
            }
        }

        newT = System.currentTimeMillis();

        System.out.println("time took for str : " + (newT - old));
    }
}
