package Honey;

public class Sample {
    public static void main(String[] args) {

        /**
         *
         * Write a function:
         *
         * class Solution { public int solution(int[] A); }
         *
         * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
         *
         * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
         *
         * Given A = [1, 2, 3], the function should return 4.
         *
         * Given A = [−1, −3], the function should return 1.
         *
         * Write an efficient algorithm for the following assumptions:
         *
         * N is an integer within the range [1..100,000];
         * each element of array A is an integer within the range [−1,000,000..1,000,000].
         */
    }
    public int solution(int[] A) {
        // write your code in Java SE 8

        // forget to cover edge cases - [0], [1]
        int max = A[0];
        int result = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0)
                return 1;
            if (max < A[i])
                max = A[i];
        }

        boolean exist = false;
        int i = 1;
        for (i = 1; i < max; i++) {
            exist = false;
            for (int j = 0; j < A.length; j++){
                if (A[j] == i) {
                    exist = true;
                    break;
                }
            }
            if (exist == false)
                return i;
        }
        if (exist == true)
            result = i+1;
        return result;
    }
}
