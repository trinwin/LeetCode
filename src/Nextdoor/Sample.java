package Nextdoor;
import java.util.*;

public class Sample {
    public static void main(String[] args) {

    }
    public static int[] mutateTheArray(int n, int[] a) {
        int [] b = new int[n];
        for (int i = 0; i < a.length; i++) {

            if (i == 0 && i == a.length-1) {
                b[i] = a[i];
            }
            else if (i == 0){
                b[i] = a[i] + a[i+1];
            }
            else if (i == a.length-1) {
                b[i] = a[i-1] + a[i];
            }
            else if (i == 0 && i == a.length-1) {
                b[i] = a[i];
            }
            else {
                b[i] = a[i-1] + a[i] + a[i+1];
            }
        }
        return b;
    }

    public static int countTinyPairs(int[] a, int[] b, int k) {
        int tiny = 0;

        for (int i = 0; i < a.length; i++) {
            String concat = String.valueOf(a[i]) + String.valueOf(b[a.length - i - 1]);
            if (Integer.parseInt(concat) < k){
                tiny++;
            }
        }
        return tiny;
    }


}
