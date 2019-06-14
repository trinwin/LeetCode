package Honey;

public class Q3 {
    public static void main(String[] args) {

    }
    public int solution(int A, int B) {

        Integer num = Integer.valueOf(A*B);
        String bin = Integer.toBinaryString(num);
        int count = 0;
        if (bin.length() == 0) return count;

        for (int i = 0; i < bin.length(); i++){
            if (Character.getNumericValue(bin.charAt(i)) == 1) count++;
        }
        return count;
    }
}
