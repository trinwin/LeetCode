package Google;

import java.util.*;

// GG_Sample sample problem
// Split String with dashes

public class GG_Sample {
    public static void main(String[] args) {
        solution("2-4A0r7-4k", 4);
    }
    public static String solution(String S, int K) {
        // write your code in Java SE 8
        // 14323-skldjf241-ksldjf23
        // each group - k characters, except group 1 - at least 1 char
        // reinsert dashes
        // lower case -> upper
        // n/k - 1 = number of
        // 8/4-1=1 => number of dashes need to be used
        // check divisible or not -

        // S = "r" and K = 1, the function should return "R".

        S = S.replaceAll("-","");
        S = S.toUpperCase();

        System.out.println(S);

        String R = "";
        int counter = 0;
        for (int i = S.length()-1; i >= 0; i--){
            if (counter == K) {
                R = R + '-';
                counter = 0;
                i++;
            } else if (counter < K){
                R = R + S.charAt(i);
                counter++;
                System.out.println(R);
            }
        }

        System.out.println(R);
        String result = "";
        for (int i = R.length()-1; i >= 0; i--){
            result = result + R.charAt(i);
        }
        System.out.println(result);
        return result;
    }
}
