package practice04;

import java.util.Arrays;

public class Q05 {
    //Type a code to change the sign(+-) of the elements in a given array.
    // input : 1,2,-3,4,-5,-6
    //output :-1,-2,3,-4,5,6
    public static void main(String[] args) {

        int[] arr={1,2,-3,4,-5,-6};
        int[] brr=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int idx=0;
        for(int w:arr){
            brr[idx]=w*-1;
            idx++;
        }
        System.out.println(Arrays.toString(brr));


    }
}
