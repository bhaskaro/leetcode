package com.oggu.lc.practice;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

public class MergeKLists {

    public static void main(String[] args) {

        ListNode list1 = ListNodeUtils.createListNode(1, 3, 5, 7, 9);
        ListNode list2 = ListNodeUtils.createListNode(2, 4, 6, 8, 10);
        ListNode list3 = ListNodeUtils.createListNode(11, 13, 15, 17, 19);
        ListNode list4 = ListNodeUtils.createListNode(12, 14, 16, 18, 20);

        ListNode merged = mergeLists(list1, list2, list3, list4);
        ListNodeUtils.printListNode(merged);
    }

    private static ListNode mergeLists(ListNode... lists) {

        ListNode out = null;

        for (ListNode list : lists) out = merge2Lists(out, list);

        return out;
    }

     private static ListNode merge2Lists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode out = new ListNode();
        ListNode temp = out;

        while (list1 != null || list2 != null) {

            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        return out.next;
    }
}
