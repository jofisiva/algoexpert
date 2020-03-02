package com.techknow.algoexpert.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RiverSize {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 0, 0, 1 }, { 1, 0, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 1, 0 } };
        List<Integer> output = riverSizes(matrix);
        Collections.sort(output);
        System.out.println(output);

    }

    public static List<Integer> riverSizes(int matrix[][]) {
        List<Integer> output = new ArrayList<>();

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (visited[i][j]) {
                    continue;
                }
                traverseNode(i, j, matrix, visited, output);
            }
        }
        return output;
    }

    public static void traverseNode(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> output) {

        int currentRiverSize = 0;

        List<Integer[]> nodes_to_explore = new ArrayList<Integer[]>();
        nodes_to_explore.add(new Integer[] { i, j });

        while (!nodes_to_explore.isEmpty()) {

            Integer[] currentNode = nodes_to_explore.get(nodes_to_explore.size() - 1);
            nodes_to_explore.remove(nodes_to_explore.size() - 1);

            i = currentNode[0];
            j = currentNode[1];

            if (visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            if (matrix[i][j] == 0) {
                continue;
            }
            currentRiverSize++;

            List<Integer[]> neighbor = getUnvisitedNeighbors(i, j, matrix, visited);
            for (Integer[] neighbor1 : neighbor) {
                nodes_to_explore.add(neighbor1);
            }
        }
        if (currentRiverSize > 0) {
            output.add(currentRiverSize);
        }
    }

    public static List<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited) {

        List<Integer[]> result = new ArrayList<Integer[]>();

        if (i > 0 && !visited[i - 1][j]) {
            result.add(new Integer[] { i - 1, j });
        }
        if (i < matrix.length - 1 && !visited[i + 1][j]) {
            result.add(new Integer[] { i + 1, j });
        }

        if (j > 0 && !visited[i][j - 1]) {
            result.add(new Integer[] { i, j - 1 });
        }
        if (j < matrix[0].length - 1 && !visited[i][j + 1]) {
            result.add(new Integer[] { i, j + 1 });
        }
        return result;
    }

}

