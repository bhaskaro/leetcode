/**
 *
 */
package com.oggu.lc.utils;

/**
 * @author Bhaskar
 *
 */
public class ListNodeUtils {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static ListNode getFirstNthElement(ListNode head, int n) {

        if (n == 0 || head == null || head.next == null)
            return head;

        int ctr = 0;

        while (head != null) {

            ctr++;

            if (ctr == n)
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

    public static int ListLength(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public static void printListNode(ListNode listNode, Object... objs) {

        if (objs != null) {
            StringBuilder sb = new StringBuilder();

            for (Object obj : objs) {
                sb.append(obj);
                sb.append(" ");
            }
            System.out.println(sb);
        }

        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static ListNode createListNode(int...nums) {

        ListNode head = new ListNode(0);
        ListNode temp = head;

        for (int i = 0; i < nums.length; i++) {

            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }

        return head.next;
    }
}
