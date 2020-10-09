package com.oggu.lc.practice;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Bhaskar
 */
public class ListGetElement {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {
        Random random = new SecureRandom();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        ListNode head = ListNodeUtils.createListNode(nums);
        ListNodeUtils.printListNode(head);

        System.out.println("---------------------------------");

        int n = random.nextInt(nums.length - 1) + 1;
        System.out.println("first : " + n + "th element : " + getFirstNthElement(head, n).val);

        n = random.nextInt(nums.length - 1) + 1;
        System.out.println("last : " + n + "th element : " + getLastNthElement(head, n).val);
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

}
