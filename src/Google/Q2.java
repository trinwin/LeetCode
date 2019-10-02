package Google;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] A ={-1, 7, 0, 7, -8, 10, 12, 40, 20};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length == 1) return 1;

        int maxLevel = 1;
        int maxTotal = A[0];
        int currLevel = 2;
        double maxNode =  Math.pow(2, (double) currLevel-1);
        int currSum = 0;

        for (int n = 1; n < A.length; n++){
            if (maxNode > 0){
                currSum += A[n];
                System.out.println("sum: " + currSum);
                maxNode--;
            }
            if (maxNode == 0 || n == A.length-1) {
                if (currSum > maxTotal) {
                    maxLevel = currLevel;
                    maxTotal = currSum;
                }
                System.out.println("Max level " + maxLevel);
                currLevel++;
                currSum = 0;
                maxNode = Math.pow(2, (double) currLevel-1);
            }
        }
        return maxLevel;
    }
}
