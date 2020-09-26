/**
 * 
 */
package com.oggu.lc.easy;

import java.util.ArrayList;
import java.util.List;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class PalindromeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode head = ListNodeUtils.fillListNode(new int[] { 1, 2 });
		ListNodeUtils.printListNode(head, "list node : ");
		System.out.println("isPalindrome : " + isPalindrome(head));

		head = ListNodeUtils.fillListNode(new int[] { 1, 2, 2, 1 });
		ListNodeUtils.printListNode(head, "list node : ");
		System.out.println("isPalindrome : " + isPalindrome(head));
	}

	public static boolean isPalindrome(ListNode head) {

		if (head == null)
			return true;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		slow = reverse(slow);

		while (slow != null) {

			if (head.val != slow.val)
				return false;

			slow = slow.next;
			head = head.next;
		}

		return true;
	}

	private static ListNode reverse(ListNode slow) {

		ListNode prev = null;

		while (slow != null) {
			ListNode next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}

		return prev;
	}

	public static boolean isPalindromeOld1(ListNode head) {

		if (head == null)
			return true;

		List<ListNode> list = new ArrayList<ListNode>();

		while (head != null) {
			list.add(head);
			head = head.next;
		}

		int left = 0;
		int right = list.size();

		while (left < right)
			if (list.get(left++).val != list.get(right-- - 1).val)
				return false;

		return true;
	}

	public boolean isPalindromeOld2(ListNode head) {

		ListNode temp = head;
		int ctr = 0;

		while (temp != null) {
			temp = temp.next;
			ctr++;
		}

		ListNode[] listNodes = new ListNode[ctr];
		ctr = -1;

		while (head != null) {
			listNodes[++ctr] = head;
			head = head.next;
		}

		int left = 0;

		while (left < ctr) {
			if (listNodes[left].val != listNodes[ctr].val) {
				return false;
			}
			left++;
			ctr--;
		}

		return true;
	}
}
