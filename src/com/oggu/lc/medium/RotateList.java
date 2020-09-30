/**
 *
 */
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
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode head = ListNodeUtils.fillListNode(nums);
        ListNodeUtils.printListNode(head);
        System.out.println("---------------------------------");
        ListNode temp = rotateRight(head, 2);
        ListNodeUtils.printListNode(temp);
        System.out.println("---------------------------------");
    }

    public static ListNode rotateRight(ListNode head, int k) {


        return null;
    }

}
