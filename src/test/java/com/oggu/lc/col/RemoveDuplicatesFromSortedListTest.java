package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedListTest {

    ListNode head = null;
    int listLen = 10000;

    @BeforeMethod
    public void setUp() {

        ListNode l1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, listLen).toArray());
        ListNode l2 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, listLen).toArray());

        head = ListNodeUtils.mergeTwoLists(l1, l2);
        Assert.assertEquals(ListNodeUtils.getListLength(head), listLen * 2);
    }

    @Test
    public void testDeleteDuplicates() {

        ListNode nondup = RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        Assert.assertNotNull(nondup);
        Assert.assertEquals(ListNodeUtils.getListLength(nondup), listLen);
    }
}