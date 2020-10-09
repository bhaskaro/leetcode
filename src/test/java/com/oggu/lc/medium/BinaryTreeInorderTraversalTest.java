package com.oggu.lc.medium;

import com.oggu.lc.utils.TreeNode;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() {

        TreeNode node = new TreeNode(10);
        List<Integer> list = BinaryTreeInorderTraversal.inorderTraversal(node);
        Assert.assertNotNull(list);
    }
}