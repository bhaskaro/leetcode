/**
 *
 */
package com.oggu.lc.col;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-cycle/ <br>
 * <br>
 * 141. Linked List Cycle <br>
 *
 * <pre>
 * Given head, the head of a linked list, determine if the linked list has a
 * cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can
 * be reached again by continuously following the next pointer. Internally, pos
 * is used to denote the index of the node that tail's next pointer is connected
 * to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Follow up:
 *
 * Can you solve it using O(1) (i.e. constant) memory?
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class LinkedListCycle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        Set<ListNode> list = new HashSet<ListNode>();

        while (head != null) {

            if (list.contains(head))
                return true;

            list.add(head);
            head = head.next;
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
