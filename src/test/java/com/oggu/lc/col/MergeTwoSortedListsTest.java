package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class MergeTwoSortedListsTest {

    ListNode l1 = null;
    ListNode l2 = null;
    int totLen = 5000;

    @BeforeMethod
    public void setUp() {
        l1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, totLen / 2).toArray());
        l2 = ListNodeUtils.createListNode(IntStream.rangeClosed((totLen / 2) + 1, totLen).toArray());
    }

    @Test
    public void testMergeTwoLists() {

        ListNode merged = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        Assert.assertNotNull(merged);
        Assert.assertEquals(ListNodeUtils.getListLength(merged), totLen);
    }
}