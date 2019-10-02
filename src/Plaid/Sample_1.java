package Plaid;

/**
 * Practice: 2 questions - 1h15m
 */

public class Sample_1 {

    public static void main(String[] args) {
        long [] a = {1,5,6,10,100};
        System.out.print(solution(a));

    }

    public static long solution(long [] numbers){
        if (numbers.length == 0) return 0;
        if (numbers.length == 1) return numbers[0];

        long max = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
