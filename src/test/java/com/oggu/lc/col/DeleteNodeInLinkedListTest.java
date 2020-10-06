package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteNodeInLinkedListTest {

    ListNode head = null;

    @BeforeMethod
    public void setUp() {
        head = ListNodeUtils.createListNode(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void testDeleteNode() {

        ListNode node = ListNodeUtils.getFirstNthElement(head, 2);
        Assert.assertNotNull(node);
        DeleteNodeInLinkedList.deleteNode(node);
        node = ListNodeUtils.getFirstNthElement(head, 2);
        Assert.assertNotNull(node);
        Assert.assertEquals(node.val, 3);
    }
}