package com.techknow.algoexpert.leetcode.week3;

public class BinaryTreePreOrder {
}


/*
 * Definition for a binary tree node.
         */
   class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {

return build_tree(preorder,0, preorder.length-1);
    }

    private TreeNode build_tree(int[] preorder, int left, int right) {

        if(left>right) return null;

       TreeNode root = new TreeNode(preorder[left]);

       if(left==right)
           return root;

       int idx = left+1;

       while(idx<=right && preorder[idx]< preorder[left]) {
           idx++;
       }

       root.left =build_tree(preorder, left+1, idx-1);
       root.right =build_tree(preorder,idx, right);

       return root;
    }
}