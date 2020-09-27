/**
 * 
 */
package com.oggu.lc.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bhaskar
 *
 */
public class LetterCombinationsOfAPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String digits = "23";
		System.out.println(digits + " ---- : " + letterCombinations(digits));

		digits = "234";
		System.out.println(digits + " ---- : " + letterCombinations(digits));

		digits = "2345";
		System.out.println(digits + " ---- : " + letterCombinations(digits));
	}

	public static List<String> letterCombinations(String digits) {

		List<String> list = new ArrayList<String>(8);

		if (digits == null || digits.length() == 0)
			return list;

		for (int i = 0; i < digits.length(); i++) {

			char charAt = digits.charAt(i);
			if (charAt == '2')
				list.add("abc");
			else if (charAt == '3')
				list.add("def");
			else if (charAt == '4')
				list.add("ghi");
			else if (charAt == '5')
				list.add("jkl");
			else if (charAt == '6')
				list.add("mno");
			else if (charAt == '7')
				list.add("pqrs");
			else if (charAt == '8')
				list.add("tuv");
			else if (charAt == '9')
				list.add("wxyz");
		}

		List<String> out = null;

		for (int i = list.size() - 1; i >= 0; i--)
			out = combine(list.get(i), out);

		return out;
	}

	private static List<String> combine(String string, List<String> list) {

		List<String> out = null;
		int length = string.length();

		if (list == null || list.isEmpty()) {
			out = new ArrayList<>(length);
			for (int i = 0; i < length; i++)
				out.add(Character.toString(string.charAt(i)));
		} else {
			out = new ArrayList<>(length * list.size());
			for (int i = 0; i < length; i++) {
				String c = Character.toString(string.charAt(i));
				for (int j = 0; j < list.size(); j++)
					out.add(c.concat(list.get(j)));
			}
		}

		return out;
	}
}
