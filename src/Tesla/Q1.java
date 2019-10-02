package Tesla;

//Find 3 largest number in an array
public class Q1 {
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,6,7,10};

        // result: [10 7 6]
        System.out.println(largest(arr));

    }

    public static int largest (int [] arr){
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }

        }
        return maxIndex;

    }
}
/**
 * Pros of React
 * Steps to create app with RESTful API
 * Frontend: Use what tool and why?
 * Backend: Use what tool and why?
 * Database: Use what tool and why?
 * MongoDB: Basic questions - Table, find
 *
 */
