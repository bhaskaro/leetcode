/**
 * 
 */
package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/ <br>
 * <br>
 * <b>19. Remove Nth Node From End of List</b><br>
 * 
 * <b>Follow up:</b><br>
 * 
 * Could you do this in one pass?
 * 
 * @author Bhaskar
 *
 */
public class RemoveNthNodeFromEndOfList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode head = ListNodeUtils.fillListNode(new int[] { 1, 2, 3, 4, 5 });
		int n = 2;
		ListNodeUtils.printListNode(head, "before revoing element ", n);
		head = removeNthFromEnd(head, n);
		ListNodeUtils.printListNode(head, "after revoing element ", n);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode temp = new ListNode(0);
		temp.next = head;
		head = temp;
		ListNode nponeth = temp;

		int ctr = 0;

		while (head != null) {

			if (ctr++ > n)
				nponeth = nponeth.next;

			head = head.next;
		}

		if (nponeth != null) {
			nponeth.next = nponeth.next.next;
		}

		return temp.next;
	}
}
