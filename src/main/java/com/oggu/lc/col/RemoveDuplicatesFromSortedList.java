package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;

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

        printListNode(head);
        deleteDuplicates(head);
        System.out.println("After removing duplicates");
        printListNode(head);

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("--------------------------------------------");
        printListNode(head);
        deleteDuplicates(head);
        System.out.println("After removing duplicates");
        printListNode(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return head;
    }

    private static void printListNode(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicatesOld(ListNode head) {

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
