/**
 *
 */
package com.oggu.lc.easy;

/**
 * @author Bhaskar
 *
 */
public class ReverseVowelsOfString {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "hello";
        System.out.println(s + " -- reversed to : " + reverseVowels(s));

        s = " ";
        System.out.println(s + " -- reversed to : " + reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            while (left < right && !isVowel(chars[left]))
                left++;

            while (right > 0 && !isVowel(chars[right]))
                right--;

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }

            right--;
            left++;
        }

        return new String(chars);
    }

    private static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    }
}
