package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * https://leetcode.com/problems/rotate-list/ <br>
 * <br>
 * 61. Rotate List <br>
 * <p>
 * Given a linked list, rotate the list to the right by k places, where k is
 * non-negative.
 *
 * <b>Example 1:</b>
 * <p>
 * Input: 1->2->3->4->5->NULL, k = 2 Output: 4->5->1->2->3->NULL Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL rotate 2 steps to the right:
 * 4->5->1->2->3->NULL
 *
 * @author Bhaskar
 */
public class RotateList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2};
        ListNode head = ListNodeUtils.createListNode(nums);
        ListNodeUtils.printListNode(head);
        System.out.println("---------------------------------");
        ListNode temp = rotateRightNew(head, 1);
        ListNodeUtils.printListNode(temp);
        System.out.println("---------------------------------");
    }

    public static ListNode rotateRightNew(ListNode head, int k) {

        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (len <= 1 || k == 0 || head.next == null)
            return head;

        k = k % len;
        if (k == 0) return head;

        ListNode kpone = head;
        int i = 0;

        //go to last element i.e. (len - k)
        while (kpone != null && ++i < len - k)
            kpone = kpone.next;

        ListNode lastNode = kpone;
        while (lastNode != null && lastNode.next != null)
            lastNode = lastNode.next;

        temp = head;
        assert kpone != null;
        head = kpone.next;
        kpone.next = null;
        lastNode.next = temp;

        return head;
    }
}
