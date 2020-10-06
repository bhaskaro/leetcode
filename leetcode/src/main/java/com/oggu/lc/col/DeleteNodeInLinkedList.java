/**
 *
 */
package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class DeleteNodeInLinkedList {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        ListNodeUtils.printListNode(head, "before delete : ");
        deleteNode(head.next);
        ListNodeUtils.printListNode(head, "after delete  : ");
    }

    public static void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }

}
