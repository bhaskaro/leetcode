/**
 *
 */
package com.oggu.lc.strs;

/**
 * https://leetcode.com/problems/valid-palindrome/ <br>
 * <br>
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 *
 * @author Bhaskar
 *
 */
public class ValidPalindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(s + " ---  isPalindrome : " + isPalindrome(s));

        s = "race a car";
        System.out.println(s + " ---  isPalindrome : " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        if (s == null)
            return false;
        else if (s.isEmpty())
            return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isAlphabetic(s.charAt(right)) && !Character.isDigit(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;
    }

    public boolean isPalindromeOld(String s) {

        if (s == null) {
            return false;
        } else if (s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isAlphabetic(s.charAt(right)) && !Character.isDigit(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;
    }

}
