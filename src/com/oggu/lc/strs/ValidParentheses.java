/**
 * 
 */
package com.oggu.lc.strs;

import java.util.Stack;

/**
 * @author Bhaskar
 *
 */
public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "()";
		System.out.println(s + " - isValid : " + isValid(s));

		s = "()[]{}";
		System.out.println(s + " - isValid : " + isValid(s));

		s = "(]";
		System.out.println(s + " - isValid : " + isValid(s));

		s = "([)]";
		System.out.println(s + " - isValid : " + isValid(s));

		s = "{[]}";
		System.out.println(s + " - isValid : " + isValid(s));
	}

	public static boolean isValid(String s) {

		boolean isValid = true;

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else {

				if (stack.isEmpty()) {
					isValid = false;
					break;
				} else if (c == '}' && stack.pop() != '{') {
					isValid = false;
					break;
				} else if (c == ')' && stack.pop() != '(') {
					isValid = false;
					break;
				} else if (c == ']' && stack.pop() != '[') {
					isValid = false;
					break;
				}

			}
		}

		return stack.isEmpty() && isValid;
	}

	public boolean isValidOld(String s) {

		if (s == null || s.isEmpty()) {
			return true;
		}

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {

				if (s.charAt(i) == ')' && (stack.isEmpty() || stack.pop() != '('))
					return false;
				if (s.charAt(i) == '}' && (stack.isEmpty() || stack.pop() != '{'))
					return false;
				if (s.charAt(i) == ']' && (stack.isEmpty() || stack.pop() != '['))
					return false;
			} else if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.add(s.charAt(i));
			}
		}

		return stack.isEmpty();
	}

}
