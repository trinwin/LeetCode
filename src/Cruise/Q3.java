package Cruise;
import java.util.*;
import java.lang.*;

public class Q3 {
    public static void main(String[] args) {

    }
    public static long countMax(List<String> upRight) {
        // Write your code here
        String [] arr = upRight.get(0).split(" ");
        int cola = Integer.parseInt(arr[0]);
        int colb  = Integer.parseInt(arr[1]);

        if(arr.length > 1){
            for(int i = 1; i < upRight.size(); i++){
                arr = upRight.get(i).split(" ");
                int str1 = Integer.parseInt(arr[0]);
                int str2 = Integer.parseInt(arr[1]);
                if(str1 < cola){
                    cola = str1;
                }
                if(str2 < colb){
                    colb = str2;
                }
            }
        }
        return cola * colb;
    }
}
