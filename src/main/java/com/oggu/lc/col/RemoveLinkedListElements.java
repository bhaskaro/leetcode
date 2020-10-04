/**
 *
 */
package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class RemoveLinkedListElements {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNodeUtils.printListNode(head, "before remove element 6");
        removeElements(head, 6);
        ListNodeUtils.printListNode(head, "after remove element 6");
    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode curr = head;

        while (curr != null && curr.val == val) {
            curr = curr.next;
        }

        ListNode root = curr;

        while (curr != null) {

            ListNode next = curr.next;

            while (next != null && next.val == val)
                next = next.next;

            curr.next = next;
            curr = curr.next;
        }

        return root;
    }

}
