package Atlassian;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {

    }
    public static long beautifulSubarrays(List<Integer> a, int m) {
        long numSubArr = 0;
        int numOdd = 0;
        int [] subArr = new int[a.size()];

        for (int i = 1; i < a.size(); i++){
            subArr[numOdd]++;
            if (a.get(i) % 2 != 0) numOdd++;

            if (numOdd >= m)
                numSubArr += subArr[numOdd - m];
        }
        return numSubArr;
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
