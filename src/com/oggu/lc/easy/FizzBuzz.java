/**
 *
 */
package com.oggu.lc.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Bhaskar
 *
 */
public class FizzBuzz {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 15;
        System.out.println("words for n : " + n);
        List<String> fizzBuzz = fizzBuzz(n);

        for (String word : fizzBuzz) {
            System.out.println(word);
        }

    }

    public static List<String> fizzBuzz(int n) {

        if (n <= 0)
            return null;

        List<String> list = new LinkedList<String>();

        for (int i = 1; i <= n; i++) {

            boolean mult3 = i % 3 == 0;
            boolean mult5 = i % 5 == 0;

            if (mult3 && mult5)
                list.add("FizzBuzz");
            else if (mult3)
                list.add("Fizz");
            else if (mult5)
                list.add("Buzz");
            else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }

    public static List<String> fizzBuzzOld(int n) {

        if (n <= 0)
            return null;

        List<String> list = new ArrayList<String>(n);

        for (int i = 1; i <= n; i++) {

            boolean mult3 = i % 3 == 0;
            boolean mult5 = i % 5 == 0;

            if (mult3 && mult5)
                list.add("FizzBuzz");
            else if (mult3)
                list.add("Fizz");
            else if (mult5)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }

        return list;
    }
}
