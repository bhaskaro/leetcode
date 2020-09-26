/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Stack;

/**
 * @author Bhaskar
 *
 */
public class ImplementQueueUsingStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		obj.push(3);

		int param_2 = obj.pop();
		int param_3 = obj.peek();
		boolean param_4 = obj.empty();

		System.out.println("pop  : " + param_2);
		System.out.println("top  : " + param_3);
		System.out.println("empty: " + param_4);
	}

	static class MyQueue {

		Stack<Integer> stack1 = null;
		Stack<Integer> stack2 = null;

		/** Initialize your data structure here. */
		public MyQueue() {

			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}

		/** Push element x to the back of queue. */
		public void push(int x) {
			stack1.push(x);
		}

		/** Removes the element from in front of queue and returns that element. */
		public int pop() {

			while (stack1.size() > 1)
				stack2.add(stack1.pop());

			int out = stack1.pop();

			while (!stack2.isEmpty())
				stack1.add(stack2.pop());

			return out;
		}

		/** Get the front element. */
		public int peek() {

			while (stack1.size() > 1)
				stack2.add(stack1.pop());

			int out = stack1.peek();
			stack2.add(stack1.pop());

			while (!stack2.isEmpty())
				stack1.add(stack2.pop());

			return out;
		}

		/** Returns whether the queue is empty. */
		public boolean empty() {
			return stack1.isEmpty();
		}
	}

}
