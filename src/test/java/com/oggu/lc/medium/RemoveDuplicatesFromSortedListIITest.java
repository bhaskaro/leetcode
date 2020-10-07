package com.oggu.lc.medium;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveDuplicatesFromSortedListIITest {

    ListNode head = null;

    @BeforeMethod
    public void setUp() {

        head = ListNodeUtils.createListNode(1, 2, 3, 3, 4, 4, 5);
    }

    @Test(invocationCount = 5)
    public void testDeleteDuplicates1() {

        ListNode filtered = RemoveDuplicatesFromSortedListII.deleteDuplicates(head);
        Assert.assertEquals(ListNodeUtils.getListLength(filtered), 3);
    }

    @Test(invocationCount = 5)
    public void testDeleteDuplicates2() {

        head = ListNodeUtils.createListNode(1, 1);
        ListNode filtered = RemoveDuplicatesFromSortedListII.deleteDuplicates(head);
        Assert.assertEquals(ListNodeUtils.getListLength(filtered), 0);
    }
}