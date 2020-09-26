/**
 * 
 */
package com.oggu.lc.col;

/**
 * @author Bhaskar
 *
 */
public class DeleteNodeInLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);

		System.out.println("before delete : ");
		printListNode(head);

		deleteNode(head.next);
		System.out.println("after delete : ");
		printListNode(head);
	}

	public static void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;
	}

	private static void printListNode(ListNode listNode) {

		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}

		System.out.println();
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
