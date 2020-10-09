package com.oggu.lc.practice;

import com.oggu.lc.utils.ListNode;
import com.oggu.lc.utils.ListNodeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class ListGetElementTest {

    @Test
    public void testMain() {

        ListGetElement.main(null);
    }

    @Test
    public void testGetFirstNthElement() {

        ListNode head = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 1000).toArray());
        ListNode out = ListGetElement.getFirstNthElement(head, 995);
        Assert.assertNotNull(out);
        Assert.assertEquals(out.val, 995);
    }

    @Test
    public void testGetLastNthElement() {

        ListNode head = ListNodeUtils.createListNode(IntStream.rangeClosed(1, 1000).toArray());
        ListNode out = ListGetElement.getLastNthElement(head, 995);
        Assert.assertNotNull(out);
        Assert.assertEquals(out.val, 6);
    }
}