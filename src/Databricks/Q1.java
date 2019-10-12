package Databricks;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {

    }
    public static void hi(int [][] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i][0])){
                map.put(arr[i][0], 0);
            }
            if (!map.containsKey(arr[i][1])){
                map.put(arr[i][1], 0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i][1])){
                map.put(arr[i][1], map.get(arr[i][1]) + 1);
            }
            else {
                map.put(arr[i][1], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + e.getValue());
        }
    }
}
