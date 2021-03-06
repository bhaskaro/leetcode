package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bhaskar
 */
public class IntersectionOfTwoLinkedLists {

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        //tested this directly in leetcode, its working fine.
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> set = new HashSet<>();

        while (headA != null || headB != null) {

            if (headA != null) {
                if (set.contains(headA))
                    return headA;
                else
                    set.add(headA);
                headA = headA.next;
            }

            if (headB != null) {
                if (set.contains(headB))
                    return headB;
                else
                    set.add(headB);
                headB = headB.next;
            }
        }

        return null;
    }
}
