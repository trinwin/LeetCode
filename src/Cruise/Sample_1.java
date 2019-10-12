package Cruise;
import java.util.*;

public class Sample_1 {
    public static void main(String[] args) {

    }
    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = l; i <=r; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        return list;
    }
}
