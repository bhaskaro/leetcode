package com.oggu.lc.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class ListNodeUtilsTest {

    @Test
    public void testMain() {

        ListNodeUtils.main(null);
    }

    @Test
    public void testGetFirstNthElement() {

        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 1000).toArray());
        ListNode temp = ListNodeUtils.getFirstNthElement(node1, 500);
        Assert.assertNotNull(temp);
        Assert.assertEquals(500, temp.val);
    }

    @Test
    public void testGetLastNthElement() {

        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 1000).toArray());
        ListNode temp = ListNodeUtils.getLastNthElement(node1, 5);
        Assert.assertNotNull(temp);
        Assert.assertEquals(996, temp.val);
    }

    @Test
    public void testMergeTwoLists() {

        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 1000).toArray());
        ListNode node2 = ListNodeUtils.createListNode(IntStream.rangeClosed(1001, 2000).toArray());

        ListNode merged = ListNodeUtils.mergeTwoLists(node1, node2);
        Assert.assertNotNull(merged);
        Assert.assertEquals(2000, ListNodeUtils.getListLength(merged));
    }

    @Test
    public void testGetListLength() {

        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 10000).toArray());
        Assert.assertNotNull(node1);
        Assert.assertEquals(10000, ListNodeUtils.getListLength(node1));
    }

    @Test
    public void testPrintListNode() {
        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 10000).toArray());
        ListNodeUtils.printListNode(node1);
    }

    @Test
    public void testCreateListNode() {
        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 10000).toArray());
        Assert.assertNotNull(node1);
        Assert.assertEquals(10000, ListNodeUtils.getListLength(node1));
    }

    @Test
    public void testToArray() {
        ListNode node1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 10000).toArray());
        Assert.assertNotNull(node1);
        int[] array = ListNodeUtils.toArray(node1);
        Assert.assertEquals(10000, array.length);
    }
}