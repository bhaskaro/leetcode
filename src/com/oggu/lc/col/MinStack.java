/**
 *
 */
package com.oggu.lc.col;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Bhaskar
 *
 */
public class MinStack {

    int listSize = -1;
    private List<Integer> list = null;
    private TreeSet<Integer> tset = null;

    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
        tset = new TreeSet<Integer>();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin()); // return -2

        minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);

        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        // System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin()); // return -2

    }

    public void push(int x) {

        list.add(x);
        tset.add(x);
        listSize++;
    }

    public void pop() {

        int x = list.remove(listSize--);

        if (!list.contains(x))
            tset.remove(x);
    }

    public int top() {
        return list.get(listSize);
    }

    public int getMin() {
        return tset.first();
    }

    public void push(int x) {

        list.add(x);
        tset.add(x);
        listSize++;
    }

    public void pop() {

        int x = list.remove(listSize--);

        if (!list.contains(x))
            tset.remove(x);
    }

    public int top() {
        return list.get(listSize);
    }

    public int getMin() {
        return tset.first();
    }

}
