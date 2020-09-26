/**
 * 
 */
package com.oggu.lc.medium;

/**
 * https://leetcode.com/problems/split-linked-list-in-parts/ <br>
 * 725. Split Linked List in Parts
 * 
 * @author Bhaskar
 *
 */
public class SplitLinkedListInParts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ListNode root = fillListNode(nums);

		printListNode(root);

		ListNode[] listParts = splitListToParts(root, 3);

		if (listParts != null)
			for (ListNode listNode : listParts) {
				printListNode(listNode);
			}
	}

	public static ListNode[] splitListToParts(ListNode root, int k) {

		int len = getLength(root);

		ListNode[] list = new ListNode[k];

		if (k > len) {

			list = new ListNode[k];

			for (int i = 0; i < k; i++) {

				if (root != null) {
					ListNode temp = root;
					root = root.next;
					temp.next = null;
					list[i] = temp;
				}
			}
		} else {

			int partLen = len / k;
			ListNode temp2 = null;

			for (int x = 0; x < k; x++) {

				ListNode temp = root;
				list[x] = temp;
				temp2 = temp;

				for (int i = 0; i < partLen; i++) {

					if (root != null)
						root = root.next;

					if (temp2 != null && i < partLen - 1)
						temp2 = temp2.next;

				}

				if (temp2 != null)
					temp2.next = null;
			}

			if (root != null) {
				temp2.next = root;
			}

		}

		return list;
	}

	static int getLength(ListNode head) {
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

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
