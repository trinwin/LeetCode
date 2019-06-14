package Honey;

public class Q1 {
    public static void main(String[] args) {

    }
    public int solution(int[] A) {
        int length = 1; //head

        if (A.length == 1) return length;

        int k = A[0]; //value

        while (k != -1 && k > 1 && k < A.length){
            length++;
            k = A[k];
        }

        return length;
    }
}

