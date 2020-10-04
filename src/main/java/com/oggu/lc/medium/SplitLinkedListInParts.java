package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * https://leetcode.com/problems/split-linked-list-in-parts/ <br>
 * 725. Split Linked List in Parts
 *
 * @author Bhaskar
 */
public class SplitLinkedListInParts {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode root = ListNodeUtils.createListNode(nums);

        ListNodeUtils.printListNode(root);

        ListNode[] listParts = splitListToParts(root, 3);

        if (listParts != null)
            for (ListNode listNode : listParts) {
                ListNodeUtils.printListNode(listNode);
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

            if (root != null)
                temp2.next = root;

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
}
