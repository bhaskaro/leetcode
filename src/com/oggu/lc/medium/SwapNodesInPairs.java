package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

public class SwapNodesInPairs {

    public static void main(String... args) {

        ListNode head = ListNodeUtils.createListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNodeUtils.printListNode(head);

        ListNode swapPairs = swapPairs(head);
        ListNodeUtils.printListNode(swapPairs, "swapParis : ");
    }

    public static ListNode swapPairs(ListNode head) {

        // if list is null or has only one node
        if (head == null || head.next == null)
            return head;

        ListNode swapped = new ListNode();
        ListNode temp = swapped;

        while (head != null && head.next != null) {

            ListNode first = head;
            ListNode second = first.next;
            ListNode third = second.next;

            second.next = first;
            first.next = third;

            temp.next = second;
            head = third;
            temp = temp.next.next;
        }

        return swapped.next;
    }

}
