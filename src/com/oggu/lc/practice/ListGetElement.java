/**
 * 
 */
package com.oggu.lc.practice;

import java.util.Random;

import com.oggu.lc.utils.ListNode;

/**
 * 
 * 
 * @author Bhaskar
 *
 */
public class ListGetElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
		ListNode head = fillListNode(nums);
		printListNode(head);

		System.out.println("---------------------------------");

		int n = new Random().nextInt(nums.length - 1) + 1;
		System.out.println("first : " + n + "th element : " + getFirstNthElement(head, n).val);

		n = new Random().nextInt(nums.length - 1) + 1;
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

	static int ListLength(ListNode head) {
		int len = 0;
		while (head != null) {
			head = head.next;
			len++;
		}
		return len;
	}

	private static void printListNode(ListNode listNode) {

		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		System.out.println();
	}

	private static ListNode fillListNode(int[] nums) {

		ListNode head = new ListNode(0);
		ListNode temp = head;

		for (int i = 0; i < nums.length; i++) {

			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}

		return head.next;
	}

}
