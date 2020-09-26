/**
 * 
 */
package com.oggu.lc.trees;

/**
 * @author Bhaskar
 *
 */
public class SameTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {

		if (p != null && q != null) {

			if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
				return true;
			} else {
				return false;
			}
		} else if (p == null && q == null) {
			return true;
		} else {
			return false;
		}
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
