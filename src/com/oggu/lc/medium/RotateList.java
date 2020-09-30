package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * https://leetcode.com/problems/rotate-list/ <br>
 * <br>
 * 61. Rotate List <br>
 *
 * Given a linked list, rotate the list to the right by k places, where k is
 * non-negative.
 *
 * <b>Example 1:</b>
 *
 * Input: 1->2->3->4->5->NULL, k = 2 Output: 4->5->1->2->3->NULL Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL rotate 2 steps to the right:
 * 4->5->1->2->3->NULL
 *
 * @author Bhaskar
 *
 */
public class RotateList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2};
        ListNode head = ListNodeUtils.fillListNode(nums);
        ListNodeUtils.printListNode(head);
        System.out.println("---------------------------------");
        ListNode temp = rotateRight(head, 1);
        ListNodeUtils.printListNode(temp);
        System.out.println("---------------------------------");
    }

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        k = k > len ? k % len : k;

        System.out.println("-----k " + k);
        //find k plus one th item
        temp = head;
        ListNode kpone = head;
        int ctr = 0;
        ListNode lastNode ;

        while (temp.next != null) {
            if (ctr++ > k)
                kpone = kpone.next;
            temp = temp.next;
        }

        lastNode = temp;
        kpone = kpone.next;

        System.out.println("-----lastNode " +lastNode.val);
        System.out.println("-----kpone " +kpone.val);

        temp = head;
        head = kpone.next;
        kpone.next = null;
        lastNode.next = temp;

        return head;
    }

    static int ListLength(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public ListNode rotateRightOld(ListNode head, int k) {

        ListNode temp = head;

        if (k == 0 || head == null || head.next == null)
            return head;

        int len = ListLength(head);
        k = k % len;

        while (k-- > 0) {

            ListNode lastbone = temp;
            ListNode last = null;

            if (lastbone != null)
                last = lastbone.next;

            // go to end of list
            while (last != null && last.next != null) {
                lastbone = lastbone.next;
                last = last.next;
            }

            if (lastbone != null)
                lastbone.next = null;

            if (last != null)
                last.next = temp;

            temp = last;
        }

        return temp;
    }
}
