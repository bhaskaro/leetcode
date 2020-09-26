/**
 * 
 */
package com.oggu.lc.col;

/**
 * @author Bhaskar
 *
 */
public class RemoveLinkedListElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);

		System.out.println("before remove element 6");
		printListNode(head);
		removeElements(head, 6);
		System.out.println("after remove element 6");
		printListNode(head);
	}

	public static ListNode removeElements(ListNode head, int val) {

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

	private static void printListNode(ListNode listNode) {

		while (listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
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
