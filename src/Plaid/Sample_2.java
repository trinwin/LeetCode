package Plaid;

public class Sample_2 {
    public static void main(String[] args) {
        long [] a = {3,6,2,9,-1,10};
        System.out.print(solution(a));
    }
    public static String solution(long [] arr) {
        if (arr.length == 0 || arr.length == 1) return "";
        long leftTotal = total(arr, 1);
        long rightTotal = total(arr, 2);

        return (rightTotal == leftTotal) ? "" : (leftTotal > rightTotal ? "Left" : "Right");
    }

    public static long total (long [] arr, int index) {
        if ((index-1) < arr.length) {
            if (arr[index-1] == -1) return 0;
            return arr[index-1] + total(arr, index * 2) + total(arr, index * 2 + 1);
        }
        return 0;
    }
}
