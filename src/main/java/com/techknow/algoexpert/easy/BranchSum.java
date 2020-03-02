package com.techknow.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    static class BinaryTree {

        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value, BinaryTree left, BinaryTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


    List<Integer> calculateSums(BinaryTree tree) {
        List<Integer> sums = new ArrayList<Integer>();

        calculateBranchSums(tree, 0, sums);
        return sums;
    }

    void calculateBranchSums(BinaryTree tree, int runningSums, List<Integer> sums) {

        int newRunningSums = runningSums + tree.value;
        if (tree.left == null && tree.right == null) {
            sums.add(newRunningSums);
        }
        calculateBranchSums(tree.left, newRunningSums, sums);
        calculateBranchSums(tree.right, newRunningSums, sums);
    }
}
