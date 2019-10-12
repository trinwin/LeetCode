package Databricks;
import java.util.*;

/*
Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:

1   2    4
 \ /   / | \
  3   5  8  9
   \ / \     \
    6   7    11

Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.

Sample input/output (pseudodata):

(parent, child)
parentChildPairs = [
    (1, 3), (2, 3), (3, 6), (5, 6),
    (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
]

Output may be in any order:

findNodesWithZeroAndOneParents(parentChildPairs) => [
  [1, 2, 4],       // Individuals with zero parents
  [5, 7, 8, 9, 11] // Individuals with exactly one parent
]

n: number of pairs in the input
*/


public class Q1 {
    public static void main(String[] argv) {
        int[][] parentChildPairs = new int[][] {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
                {4, 5}, {4, 8}, {4, 9}, {9, 11}
        };
        findNodesWithZeroAndOneParents(parentChildPairs);

    }

    public static void findNodesWithZeroAndOneParents(int [][] arr) {
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
            if (!map.containsKey(arr[i][0])){
                map.put(arr[i][0], 0);
            }
            if (!map.containsKey(arr[i][1])){
                map.put(arr[i][1], 0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i][1])){
                map.put(arr[i][1], map.get(arr[i][1])+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Key" + entry.getKey() + " - Value:" + entry.getValue());
        }

    }
}
