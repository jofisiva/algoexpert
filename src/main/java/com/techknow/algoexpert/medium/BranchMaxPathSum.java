package com.techknow.algoexpert.medium;

/*class BinaryTree {

    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BranchMaxPathSum {

    int max_path_sum;

    public int maxPathSum(BinaryTree value) {
        max_path_sum = Integer.MIN_VALUE;
        getMax_path_sum(value);

        return max_path_sum;
    }

    public int getMax_path_sum(BinaryTree node) {

        if (node == null) {
            return 0;
        }

        int left = Math.max(max_path_sum, getMax_path_sum(node.left));
        int right = Math.max(max_path_sum, getMax_path_sum(node.right));
        max_path_sum = Math.max(max_path_sum, left + right + node.value);

        return Math.max(left, right) + node.value;
    }
}*/

class BranchMaxPathSum {
    private static int max_path_sum;

    public static int maxPathSum(BinaryTree tree) {
        max_path_sum = Integer.MIN_VALUE;
        getMax_path_sum(tree);

        return max_path_sum;
    }
    public static int getMax_path_sum(BinaryTree node) {

        if (node == null) {
            return 0;
        }

        int left = Math.max(0, getMax_path_sum(node.left));
        int right = Math.max(0, getMax_path_sum(node.right));
        max_path_sum = Math.max(max_path_sum, left + right + node.value);

        return Math.max(left, right) + node.value;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
