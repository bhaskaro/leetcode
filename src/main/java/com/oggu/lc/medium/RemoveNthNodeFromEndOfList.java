package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

import java.security.SecureRandom;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/ <br>
 * <br>
 * <b>19. Remove Nth Node From End of List</b><br>
 *
 * <b>Follow up:</b><br>
 * <p>
 * Could you do this in one pass?
 *
 * @author Bhaskar
 */
public class RemoveNthNodeFromEndOfList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        ListNode head = ListNodeUtils.createListNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        int n = new SecureRandom().nextInt(10);
        ListNodeUtils.printListNode(head, "before revoing element ", n);
        head = removeNthFromEnd(head, n);
        ListNodeUtils.printListNode(head, "after revoing element ", n);


        head = ListNodeUtils.createListNode(1);
        ListNodeUtils.printListNode(head, "before revoing element ", 1);
        head = removeNthFromEnd(head, n);
        ListNodeUtils.printListNode(head, "after revoing element ", 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode();
        temp.next = head;
        head = temp;
        ListNode npone = head;

        int ctr = 0;

        //get nplus one node
        while (head != null) {
            if (ctr++ > n) npone = npone.next;
            head = head.next;
        }

        //remove nth node
        if (npone != null && npone.next != null) npone.next = npone.next.next;

        return temp.next;
    }

}
