/**
 * 
 */
package com.oggu.lc.medium;

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

		int[] nums = new int[] { 1, 2, 3 };
		ListNode head = getListNode(nums);
		printListNode(head);
		System.out.println("---------------------------------");
		ListNode temp = rotateRight(head, 2000000000);
		printListNode(temp);
		System.out.println("---------------------------------");
	}

	public static ListNode rotateRight(ListNode head, int k) {

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
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}

	private static ListNode getListNode(int[] nums) {

		ListNode head = new ListNode(0);
		ListNode temp = head;

		for (int i = 0; i < nums.length; i++) {

			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}

		return head.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
