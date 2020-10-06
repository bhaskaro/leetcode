package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNodeUtils.printListNode(head, "Before removing duplicates");
        deleteDuplicates(head);
        ListNodeUtils.printListNode(head, "After removing duplicates");

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("--------------------------------------------");
        ListNodeUtils.printListNode(head, "Before removing duplicates");
        deleteDuplicates(head);
        ListNodeUtils.printListNode(head, "After removing duplicates");
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while (node != null && node.next != null) {

            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }

}
