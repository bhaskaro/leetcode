/**
 *
 */
package com.oggu.lc.col;

/**
 * @author Bhaskar
 *
 */
public class MergeTwoSortedLists {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode merged = mergeTwoLists(l1, l2);

        printListNode(merged);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode merged = new ListNode(0);
        ListNode head = merged;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                merged.next = l1;
                l1 = l1.next;
            } else {
                merged.next = l2;
                l2 = l2.next;
            }

            merged = merged.next;
        }

        while (l1 != null) {
            merged.next = l1;
            l1 = l1.next;
            merged = merged.next;
        }
        while (l2 != null) {
            merged.next = l2;
            l2 = l2.next;
            merged = merged.next;
        }

        return head.next;
    }

    private static void printListNode(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
