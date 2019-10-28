package Atlassian;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {

    }
    public static int maxDifference(List<Integer> nums) {
        // Write your code here
        if (nums.size() < 1) return -1;
        int maxDiff = nums.get(1) - nums.get(0);
        int min_element = nums.get(0);

        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i) - min_element > maxDiff)
                maxDiff = nums.get(i) - min_element;
            if (nums.get(i) < min_element)
                min_element = nums.get(i);
        }

        return maxDiff;
    }
}
