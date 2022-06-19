package practice06;

import java.util.Arrays;

public class Q06 {
    /*
       Find the middle element in an integer array
      Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
      (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
    public static void main(String[] args) {
        int[] arr={12, 5, 8, 13, 15, 50};
        Arrays.sort(arr);
        int middleIdx=arr.length/2;
        System.out.println(Arrays.toString(arr));
        if(arr.length%2!=0){
            System.out.println(arr[middleIdx]);
        }else {
            int middle=(arr[middleIdx]+arr[middleIdx-1])/2;
            System.out.println(middle);
        }

    }
}
