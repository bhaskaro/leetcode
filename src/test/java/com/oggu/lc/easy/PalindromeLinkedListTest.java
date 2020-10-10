package com.oggu.lc.easy;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeLinkedListTest {

    @Test
    public void testMain() {

        PalindromeLinkedList.main(null);
    }

    @Test
    public void testIsPalindrome() {

        ListNode head = ListNodeUtils.createListNode(1, 2, 2, 1);
        boolean palindrome = PalindromeLinkedList.isPalindrome(head);
        Assert.assertTrue(palindrome);
    }

    @Test
    public void testIsPalindromeOld1() {

        ListNode head = ListNodeUtils.createListNode(1, 2, 2, 1);
        boolean palindrome = PalindromeLinkedList.isPalindromeOld1(head);
        Assert.assertTrue(palindrome);
    }

    @Test
    public void testIsPalindromeOld2() {

        ListNode head = ListNodeUtils.createListNode(1, 2, 2, 1);
        boolean palindrome = PalindromeLinkedList.isPalindromeOld2(head);
        Assert.assertTrue(palindrome);
    }
}