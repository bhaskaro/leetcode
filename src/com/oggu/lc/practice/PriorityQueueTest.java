/**
 *
 */
package com.oggu.lc.practice;

import java.util.PriorityQueue;

/**
 * @author Bhaskar
 *
 */
public class PriorityQueueTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        pq.add(3);
        pq.add(1);
        pq.add(5);
        pq.add(2);
        pq.add(4);

        System.out.println(pq);
    }

}
