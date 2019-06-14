package Honey;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        int [] a = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        solution(a);

    }
    public static int solution(int[] ranks) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < ranks.length; i++) {

            if (map.containsKey(ranks[i])) {
                int count = map.get(ranks[i]);
                map.put(ranks[i], count+1);
            }
            else {
                map.put(ranks[i], 1);
            }
        }

        int total = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

            if (map.containsKey(entry.getKey()+1) && entry.getValue() > 1 && map.get(entry.getKey()+1) > 1)
                total += entry.getValue();
        }

        return total;
    }
}
