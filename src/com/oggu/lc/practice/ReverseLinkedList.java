/**
 *
 */
package com.oggu.lc.practice;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class ReverseLinkedList {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ListNode head = ListNodeUtils.fillListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNodeUtils.printListNode(head, "before reversing");
        head = reverseList(head);
        ListNodeUtils.printListNode(head, "after reversing");
    }

    private static ListNode reverseList(ListNode head) {

        // null --> 1 --> 2 --> 3 --> 4 --> 5 --> null

        ListNode prev = null;

        while (head != null) {

            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

}
