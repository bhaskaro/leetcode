/**
 * 
 */
package com.oggu.lc.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/sort-list/ <br>
 * <br>
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * 
 * @author Bhaskar
 *
 */
public class SortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode listNode = new ListNode(4);
		listNode.next = new ListNode(3);
		listNode.next.next = new ListNode(2);
		listNode.next.next.next = new ListNode(1);

		ListNode sorted = sortList(listNode);

		printListNode(sorted);
	}

	public static ListNode sortList(ListNode head) {

		ListNode temp = new ListNode(0);
		ListNode root = temp;

		List<ListNode> list = new ArrayList<ListNode>();

		while (head != null) {
			list.add(head);
			head = head.next;
		}

		Collections.sort(list, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});

		for (ListNode listNode : list) {
			temp.next = listNode;
			temp = temp.next;
		}

		temp.next = null;

		return root.next;
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

		ListNode(int x) {
			val = x;
		}
	}
}
