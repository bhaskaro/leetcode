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
public class RemoveLinkedListElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode head = ListNodeUtils.fillListNode(new int[] { 3, 3, 3, 1, 2, 3, 3, 5, 6, 7, 8, 6, 2, 3 });

		ListNodeUtils.printListNode(head, "before removing");
		int val = 3;
		System.out.println("after removing element : " + val);
		head = removeElements(head, val);
		ListNodeUtils.printListNode(head, "after removing");
	}

	public static ListNode removeElements(ListNode head, int val) {

		if (head == null)
			return head;

		while (head != null && head.val == val) {
			head = head.next;
		}

		ListNode out = head;

		while (head.next != null) {
			if (head.next.val == val)
				head.next = head.next.next;
			else
				head = head.next;
		}

		return out;
	}

	public ListNode removeElementsOld(ListNode head, int val) {

		ListNode curr = head;

		while (curr != null && curr.val == val) {
			curr = curr.next;
		}

		ListNode root = curr;

		while (curr != null) {

			ListNode next = curr.next;

			while (next != null && next.val == val) {
				next = next.next;
			}

			curr.next = next;
			curr = curr.next;
		}

		return root;
	}

}
