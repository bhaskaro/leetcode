package com.oggu.lc.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeUtilsTest {

    private Node head = null;

    @Test(priority = 1)
    public void testCreateListNode() {

        head = NodeUtils.createListNode(1, 2, 3, 4, 5);
        Assert.assertEquals(1, head.val);
    }


    @Test(priority = 3)
    public void testGetFirstNthElement() {

        Node node = NodeUtils.getFirstNthElement(head, 3);
        Assert.assertNotNull(node);
        Assert.assertEquals(3, node.val);
    }

    @Test
    public void testGetLastNthElement() {

        Node node = NodeUtils.getLastNthElement(head, 2);
        Assert.assertNotNull(node);
        Assert.assertEquals(4, node.val);
    }

    @Test
    public void testGetListLength() {

        int length = NodeUtils.getListLength(head);
        Assert.assertEquals(5, length);
    }

    @Test
    public void testPrintListNode() {

        NodeUtils.printListNode(head);
    }
}