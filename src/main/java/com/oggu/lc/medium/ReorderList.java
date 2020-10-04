/**
 *
 */
package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class ReorderList {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ListNode head = ListNodeUtils.createListNode(1, 2, 3, 4, 5, 11, 12, 13, 14, 15);
        ListNodeUtils.printListNode(head, "before reordering");
        reorderList(head);
        ListNodeUtils.printListNode(head, "after reordering");
    }

    public static void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        slow = temp;

        slow = reverse(slow);

        while (head != null && slow != null) {

            ListNode next = head.next;

            temp = slow;
            slow = slow.next;

            temp.next = next;
            head.next = temp;

            head = head.next.next;
        }

    }

    private static ListNode reverse(ListNode head) {

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
