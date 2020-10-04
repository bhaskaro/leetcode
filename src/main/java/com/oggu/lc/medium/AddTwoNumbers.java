/**
 *
 */
package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;

/**
 * @author Bhaskar
 *
 */
public class AddTwoNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ListNode l1 = ListNodeUtils.createListNode(2, 4, 3);
        ListNode l2 = ListNodeUtils.createListNode(5, 6, 4);

        ListNodeUtils.printListNode(l1, "before addition");
        ListNodeUtils.printListNode(l2, "before addition");

        ListNode l3 = addTwoNumbers(l1, l2);
        ListNodeUtils.printListNode(l3, "after  addition");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode out = new ListNode();
        ListNode temp = out;

        int rem = 0;

        while (l1 != null || l2 != null) {

            int sum = rem;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            rem = sum > 9 ? 1 : 0;
            sum = sum > 9 ? sum % 10 : sum;

            temp.next = new ListNode(sum);
            temp = temp.next;
        }

        // add last digit
        if (rem > 0)
            temp.next = new ListNode(rem);

        return out.next;
    }
}
