package Cruise;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {

    }
    public static int maxDifference(List<Integer> arr) {
        // Write your code here
        int maxDiff = arr.get(1) - arr.get(0);
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++)
        {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) - min > maxDiff) {
                maxDiff = arr.get(i) - min;
            }

        }
        return maxDiff;

//
//        int maxDiff = -1;
//
//        for (int i = 0; i < arr.size(); ++i)
//        {
//            for (int j = arr.size() - 1; j > i; --j)
//            {
//                if (arr.get(j) > arr.get(i) && maxDiff < (j - i))
//                    maxDiff = j - i;
//            }
//        }
//
//        return maxDiff;


    }
}
