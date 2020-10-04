/**
 *
 */
package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Bhaskar
 *
 */
public class DeleteNodeInLinkedList {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args
     */
    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        logger.info("before delete : ");
        ListNodeUtils.printListNode(head);

        deleteNode(head.next);
        logger.info("after delete : ");
        ListNodeUtils.printListNode(head);
    }

    public static void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }

}
