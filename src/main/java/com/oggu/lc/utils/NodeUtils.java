package com.oggu.lc.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Bhaskar
 */
public class NodeUtils {

    private static Logger logger = LogManager.getLogger();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static Node getFirstNthElement(Node head, int n) {

        if (n == 0 || head == null)
            return head;

        int ctr = 0;

        while (head != null) {

            if (++ctr == n) return head;

            head = head.next;
        }

        return null;
    }

    public static Node getLastNthElement(Node head, int n) {

        if (n == 0)
            return null;

        int ctr = 0;

        Node nth = null;
        Node temp = head;

        while (head != null) {

            ctr++;

            if (ctr == n)
                nth = temp;
            else if (ctr > n && nth != null)
                nth = nth.next;

            head = head.next;
        }

        return nth;
    }

    public static int ListLength(Node head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public static void printListNode(Node node, Object... objs) {

        StringBuilder sb = new StringBuilder();

        if (objs != null) {
            for (Object obj : objs) {
                sb.append(obj);
                sb.append(" ");
            }
        }

        while (node != null) {
            sb.append(node.val).append(" ");
            node = node.next;
        }
        logger.info(sb);
    }

    public static Node createListNode(int... nums) {

        Node head = new Node(0);
        Node temp = head;

        for (int num : nums) {
            temp.next = new Node(num);
            temp = temp.next;
        }

        return head.next;
    }
}
