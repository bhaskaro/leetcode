package com.oggu.lc.col;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class IntersectionOfTwoLinkedListsTest {

    ListNode head1 = null;
    ListNode head2 = null;

    @BeforeMethod
    public void setUp() {

        head1 = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 1000).toArray());
        head2 = ListNodeUtils.createListNode(IntStream.rangeClosed(1000, 10000).toArray());
    }

    @Test
    public void testGetIntersectionNode() {

        ListNode node = IntersectionOfTwoLinkedLists.getIntersectionNode(head1, head2);
        Assert.assertNotNull(node);
        Assert.assertEquals(node.val, 1000);
    }
}