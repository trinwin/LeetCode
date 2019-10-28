//package Atlassian;
//
//import java.util.*;
//
//public class Q4 {
//    public static void main(String[] args) {
//        List<String> arr = Arrays.asList("1 2", "1 4");
//        connectedSum(4, arr);
//    }
//    public static int maxDifference(List<Integer> nums) {
//        // Write your code here
//        if (nums.size() < 1) return -1;
//        int maxDiff = nums.get(1) - nums.get(0);
//        int min_element = nums.get(0);
//
//        for (int i = 1; i < nums.size(); i++){
//            if (nums.get(i) - min_element > maxDiff)
//                maxDiff = nums.get(i) - min_element;
//            if (nums.get(i) < min_element)
//                min_element = nums.get(i);
//        }
//
//        return maxDiff;
//    }
//
//    public static int connectedSum(int n, List<String> edges) {
//        // Write your code here
//        int finalSum = 0;
//        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(){};
//
//        for (int i = 0; i < edges.size(); i++){
//            System.out.println(edges.get(i));
//            int space = edges.get(i).indexOf(' ');
//            int length = edges.get(i).length();
//            int a = Integer.parseInt(edges.get(i).substring(0, space));
//            int b = Integer.parseInt(edges.get(i).substring(space+1, length));
////            System.out.println(a + " - " + b);
//
//            int newSum = 0;
//            List<Integer> newList = new ArrayList<Integer>(){};
//            System.out.println("Hi");
////            for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
//                System.out.println("Hi");
//                if (map.getValue().contains(a) || e.getValue().contains(b)){
//                    newSum = e.getKey() + i;
//                    e.getValue().add(i);
//                    newList = e.getValue();
//                    map.put(newSum, newList);
//                    System.out.println(newSum);
//                } else {
//                    newList.add(a);
//                    newList.add(b);
//                    newSum = a + b;
//                    map.put(newSum, newList);
//                    System.out.println(newSum);
//                }
////            }
//        }
//        for (int j = 0; j < n; j++) {
//            for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
//                if (!e.getValue().contains(j)){
//                    finalSum += 1;
//                }
//            }
//        }
//
//        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
//            finalSum += Math.ceil(Math.sqrt(e.getKey()));
//        }
//        return finalSum;
//    }
//
//}
