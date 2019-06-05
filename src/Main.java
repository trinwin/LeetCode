import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isPalindrome(-101));
//        String [] str = {"a","b"};
//        System.out.println(longestCommonPrefix(str));

    }
//    0 1 2
//      1
//    0 1 2


    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        int count = 0;
        int ehour = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '?')
                count++;
            else
                ehour += Character.getNumericValue(pattern.charAt(i));
        }
        int numleft = workHours - ehour;
        // if (numleft )
        int hourperday = numleft / count;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '?') {
                System.out.println("Hi");
                s.append((char) hourperday);
                // pattern.replace(pattern.charAt(i), );

            } else {
                s.append(pattern.charAt(i));
                // newS += pattern.charAt(i);
            }
            System.out.println(s.toString());

        }
        result.add(s.toString());
        return result;


    }

    public static void maxStreak(int m, List<String> data) {
        // Write your code here
        int max =0;
        for (int i = 0; i < data.size(); i++){
//            int temp =
            for (int j = 0; j < m; j++){
                if (data.get(j).charAt(i) != 'N')
                    max++;
            }

        }
    }

    static int[] rotLeft(int[] a, int d) {
        int [] b = new int[a.length-d];

        for (int i = 0; i < d; i++){
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++){
                a[i] = a[a.length - d + i + 1];
        }
        for (int i = d, j = 0; j < b.length; i++, j++){
            a[i] = b[j];
        }
        return a;
    }


//    static int hourglassSum(int[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j < 6; j++){
//                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + ;
//            }
//        }
//        return sum;
//    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int minLen = strs[0].length();

        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() == 0) return strs[i];
            minLen = Math.min(minLen, strs[i].length());
        }

        String prefix = Character.toString(strs[0].charAt(0));
        for (int i = 0; i < minLen; i++){
            for (int n = 1; n < strs.length; n++){
//                System.out.println(strs[n].substring(0, prefix.length()));
//                System.out.println(prefix);
                if (!prefix.equalsIgnoreCase(strs[n].substring(0, prefix.length()))){
                    return prefix.substring(0, prefix.length()-1);
                }
            }
            prefix += Character.toString(strs[0].charAt(i+1));
//            System.out.println(i + prefix);
        }
        return prefix;
    }

    public static boolean isPalindrome(int x) {
        //solve without converting to a string
        if (x < 0) return false; //negative number
        //-121 100 101 1001
        String str = Integer.toString(x);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length() - (i+1)))
            {
                return false;
            }
        }
        return true;



        // while (x!=0){
        //     int left = ;
        //     int right = x % 10;
        // }

    }









    /**
     *
     *
     */

    public static int entryTime(String s, String keypad) {
        // Write your code here
        int time = 0;

        if (s.length() == 0 || keypad.length() == 0) return 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < keypad.length(); i++){
            if (i < 3){
                map.put((Character.getNumericValue(keypad.charAt(i))), 0);
            }
            if (i > 2 && i < 6){
                map.put((Character.getNumericValue(keypad.charAt(i))), 1);
            }
            if (i > 5 && i < 9) {
                map.put((Character.getNumericValue(keypad.charAt(i))), 2);
            }
        }

        for (int i = 0; i < s.length(); i++){
            int value1 = map.get(Character.getNumericValue(s.charAt(i)));
            int value2 = map.get(Character.getNumericValue(s.charAt(i+1)));
            if (value1 == value2 && s.charAt(i) != s.charAt(i+1)){
                time += 1;
            } else if (s.charAt(i) == s.charAt(i+1)){
                time += 0;
            } else {
                time = Math.abs(value1 - value2);
            }
        }

        return time;

    }



//    public static String rollingString(String s, List<String> operations) {
//        // Write your code here
//        if (operations.isEmpty()) return "";
//        for (int n = 0; n < operations.size(); n++){
//            String op = operations.get(n).toUpperCase();
//            int i = Integer.parseInt(op.substring(0,1));
//            int j = Integer.parseInt(op.substring(2,3));
//            String ch = op.substring(4);
//            //Use ascii value (lowercase letter) a - 97, z - 122
//            if (ch == "L"){
//                for (int k = i; k<j; k++){
//                    if ()
//                        char newChar =  (char) (s.charAt(k)-1);
//                    s.replace(s.charAt(k), newChar);
//                    System.out.println(s);
//                }
//
//            } else if (ch == "R"){
//                for (int k = i; k<j; k++) {
//                    char newChar = (char) (s.charAt(k) + 1);
//                    s.replace(s.charAt(k), newChar);
//                }
//            }
//
//        }
//        return s;
//    }
//
//    public static int reductionCost(List<Integer> num) {
//        // Write your code here
//        if (num.isEmpty()) return 0;
//        int minCost = 0, sum = 0, i=0, j = 1;
//        do{
//            Collections.sort(num);
//            sum = num.get(i) + num.get(j);
//            minCost += sum;
//            num.set(i,sum);
//            num.remove(j);
//        }while(num.size() > 1);
//        return minCost;
//    }
//
//    static List<Integer> oddNumbers(int l, int r) {
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i=l; i<=r ;i++){
//            if (i%2!=0) {
//                list.add(i);
//            }
//        }
//        return list;
//
//    }
//
//    static String findNumber(List<Integer> arr, int k) {
//        for (int i = 0; i< arr.size(); i++){
//            if (arr.get(i)==k) {
//                return "YES";
//            }
//        }
//        return "NO";
//    }
}
