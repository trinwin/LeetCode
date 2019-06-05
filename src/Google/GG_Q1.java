package Google;

import java.util.*;

public class GG_Q1 {
    public static void main(String[] args) {
        solution("abcdefghijklmnopqrstuvwxyz", "cba");
    }

    public static int solution(String S1, String S2) {
        // write your code in Java SE 8

        //S1 = abcdefghijklmnopqrstuvwxyz
        //S2 = cba

        int time = 0;

        if (S2.length() == 1) return 0;

        int i = 0;
        for (int n = 0; n < S2.length(); n++){
            int j = S1.indexOf(S2.charAt(n));
            time += Math.abs(j-i);
            i = j;
        }

        System.out.println(time);
        return time;

    }

}
