package com.oggu.lc.easy;

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

        ListNode head = ListNodeUtils.createListNode(3, 3, 3, 1, 2, 3, 3, 5, 6, 7, 8, 6, 2, 3);

        int val = 3;
        ListNodeUtils.printListNode(head, "before removing : ", val, " -- ");
        head = removeElements(head, val);
        ListNodeUtils.printListNode(head, "after removing  : ", val, " -- ");
    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return head;

        while (head != null && head.val == val)
            head = head.next;

        ListNode out = head;

        while (head != null && head.next != null)
            if (head.next.val == val)
                head.next = head.next.next;
            else
                head = head.next;

        return out;
    }

}
