package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

public class RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {

        ListNode head = ListNodeUtils.createListNode(1, 2, 3, 3, 4, 4, 5);
        ListNodeUtils.printListNode(head, "Before removing duplicates : ");
        head = deleteDuplicates(head);
        ListNodeUtils.printListNode(head, "After removing duplicates : ");

        head = ListNodeUtils.createListNode(1, 1);
        ListNodeUtils.printListNode(head, "Before removing duplicates : ");
        head = deleteDuplicates(head);
        ListNodeUtils.printListNode(head, "After removing duplicates : ");
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode root = new ListNode();
        root.next = head;
        ListNode temp = root;
        ListNode prev;

        while (head != null) {

            int ctr = 0;
            prev = head;

            while (head != null && head.val == prev.val) {
                ctr++;
                head = head.next;
            }

            if (ctr == 1) {
                temp.next = prev;
                temp = temp.next;
                temp.next = null;
            } else {
                temp.next = null;
            }
        }

        return root.next;
    }
}
