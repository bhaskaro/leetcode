package com.oggu.lc.easy;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 */
public class ReverseLinkedList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        ListNode head = ListNodeUtils.fillListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNodeUtils.printListNode(head, "before reversnig");
        ListNode reverseList = reverseList(head);
        ListNodeUtils.printListNode(reverseList, "after reversnig");
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode next;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
