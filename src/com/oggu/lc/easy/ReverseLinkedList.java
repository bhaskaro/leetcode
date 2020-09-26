/**
 * 
 */
package com.oggu.lc.easy;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode head = ListNodeUtils.fillListNode(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		ListNodeUtils.printListNode(head, "before reversnig");
		head = reverseList(head);
		ListNodeUtils.printListNode(head, "after reversnig");
	}

	public static ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode first = head;
		ListNode temp = head.next;
		first.next = null;

		while (temp != null) {
			ListNode temp2 = temp.next;
			temp.next = first;
			first = temp;

			temp = temp2;
		}

		return first;
	}
}
