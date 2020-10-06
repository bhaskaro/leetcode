package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/sort-list/ <br>
 * <br>
 * Sort a linked list in O(n log n) time using constant space complexity.
 *
 * @author Bhaskar
 */
public class SortList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);

        ListNode sorted = sortList(listNode);

        ListNodeUtils.printListNode(sorted, "Sorted List : ");
    }


    public static ListNode sortList(ListNode head) {

        ListNode temp = new ListNode(0);
        ListNode root = temp;

        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        list.sort(Comparator.comparingInt(o -> o.val));

        for (ListNode listNode : list) {
            temp.next = listNode;
            temp = temp.next;
        }

        temp.next = null;

        return root.next;
    }

}
