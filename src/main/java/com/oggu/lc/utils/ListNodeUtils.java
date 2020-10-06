package com.oggu.lc.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Bhaskar
 */
public class ListNodeUtils {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static ListNode getFirstNthElement(ListNode head, int n) {

        if (n == 0 || head == null)
            return head;

        int ctr = 0;

        while (head != null) {

            if (++ctr == n)
                return head;

            head = head.next;
        }

        return null;
    }

    public static ListNode getLastNthElement(ListNode head, int n) {

        if (n == 0)
            return null;

        int ctr = 0;

        ListNode nth = null;
        ListNode temp = head;

        while (head != null) {

            ctr++;

            if (ctr == n)
                nth = temp;
            else if (ctr > n)
                nth = nth.next;

            head = head.next;
        }

        return nth;
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

    public static int getListLength(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public static void printListNode(ListNode listNode, Object... objs) {

        StringBuilder sb = new StringBuilder();

        if (objs != null) {
            for (Object obj : objs) {
                sb.append(obj);
                sb.append(" ");
            }
        }

        while (listNode != null) {
            sb.append(listNode.val).append(" ");
            listNode = listNode.next;
        }
        logger.info(sb);
    }

    public static ListNode createListNode(int... nums) {

        ListNode head = new ListNode(0);
        ListNode temp = head;

        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return head.next;
    }
}
