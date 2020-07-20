package org.example.leetcode.tree;

import org.example.leetcode.TreeNode;

public class MaxDepthOfTree {
    /*
        LC45 求给定二叉树的最大深度，
     */
    public int maxDepth (TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}