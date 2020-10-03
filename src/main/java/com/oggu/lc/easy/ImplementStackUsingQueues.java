/**
 *
 */
package com.oggu.lc.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Bhaskar
 *
 */
public class ImplementStackUsingQueues {

    /**
     * @param args
     */
    public static void main(String[] args) {

        MyStack obj = new MyStack();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();

        System.out.println("pop  : " + param_2);
        System.out.println("top  : " + param_3);
        System.out.println("empty: " + param_4);
    }

    static class MyStack {

        Queue<Integer> queue1 = null;
        Queue<Integer> queue2 = null;

        /** Initialize your data structure here. */
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue1.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {

            int out;

            while (queue1.size() > 1)
                queue2.add(queue1.poll());

            out = queue1.poll();

            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return out;
        }

        /** Get the top element. */
        public int top() {

            int out;

            while (queue1.size() > 1)
                queue2.add(queue1.poll());

            out = queue1.peek();
            queue2.add(queue1.poll());

            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return out;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
