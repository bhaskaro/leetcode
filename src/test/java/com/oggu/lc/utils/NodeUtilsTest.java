package com.oggu.lc.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NodeUtilsTest {

    private Node head = null;

    @BeforeMethod
    public void setUp() {
        head = NodeUtils.createListNode(1, 2, 3, 4, 5);
    }

    @Test(priority = 1)
    public void testCreateListNode() {

        head = NodeUtils.createListNode(1, 2, 3, 4, 5);
        Assert.assertEquals(head.val, 1);
    }


    @Test(priority = 3)
    public void testGetFirstNthElement1() {

        Node node = NodeUtils.getFirstNthElement(head, 3);
        Assert.assertNotNull(node);
        Assert.assertEquals(node.val, 3);
    }

    @Test(priority = 4)
    public void testGetFirstNthElement2() {

        Node node = NodeUtils.getFirstNthElement(null, 0);
        Assert.assertNull(node);
    }

    @Test
    public void testGetLastNthElement1() {

        Node node = NodeUtils.getLastNthElement(head, 2);
        Assert.assertNotNull(node);
        Assert.assertEquals(node.val, 4);
    }

    @Test
    public void testGetLastNthElement2() {

        Node node = NodeUtils.getLastNthElement(head, 0);
        Assert.assertNull(node);
    }

    @Test
    public void testGetListLength() {

        int length = NodeUtils.getListLength(head);
        Assert.assertEquals(length, 5);
    }

    @Test
    public void testPrintListNode() {

        NodeUtils.printListNode(head, "test print list node");
    }


}