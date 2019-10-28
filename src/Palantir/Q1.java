package Palantir;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int [][] arr = { { 1, 2 , 5}, { 3, 4 , 6} };
        boolean [][] arr2 = findHighPoints(arr);
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[0].length; c++) {
                System.out.print(arr2[r][c] + " ");
                if (c == arr2[0].length -1) System.out.println("\n");
            }
        }
    }
    public static boolean[][] findHighPoints(int[][] elevations) {
        // Write your code here
        boolean [][] highPoint = new boolean[elevations.length][elevations[0].length];
        int [][] temp = new int[elevations.length+2][elevations[0].length+2];

        if (elevations.length == 0) return highPoint;

        //Create a zero barrier outside of 2d array elevations
        for (int r = 0; r < temp.length; r++) {
            for (int c = 0; c < temp[0].length; c++) {
                if (r == 0 || c == 0 || r == temp.length-1 || c == temp[0].length-1){
                    temp[r][c] = 0;
                }
                else{
                    temp[r][c] = elevations[r-1][c-1];
                }
                 System.out.print(temp[r][c] + " ");
                 if (c == temp[0].length -1) System.out.println("\n");
            }
        }

        //Compare elevation with neighbors
        for (int r = 1; r <= elevations.length; r++) {
            for (int c = 1; c <= elevations[0].length; c++) {
//                if (r == 0 && c == 4) System.out.println(elevations[r][c]);
                if (temp[r][c] > temp[r][c+1] &&
                    temp[r][c] > temp[r][c+1] &&
                    temp[r][c] > temp[r-1][c-1] &&
                    temp[r][c] > temp[r-1][c] &&
                    temp[r][c] > temp[r-1][c+1] &&
                    temp[r][c] > temp[r+1][c-1] &&
                    temp[r][c] > temp[r+1][c] &&
                    temp[r][c] > temp[r+1][c+1]
                ) {
                    highPoint[r-1][c-1] = true;
                }
                else highPoint[r-1][c-1] = false;
            }
        }
        return highPoint;
    }
}
