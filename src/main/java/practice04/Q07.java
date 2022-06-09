package practice04;

public class Q07 {
    //Type code to print the elements of an array those are greater than average.
    //int[] arr={5, 9, 15, 1, 0, 11, 3};
    public static void main(String[] args) {

        int[] arr={5, 9, 15, 1, 0, 11, 3};
        int sum=0;
        for(int w:arr){
            sum+=w;
        }
        System.out.println("Average: "+sum/arr.length);
        int average=sum/arr.length;

        System.out.println("The number greater than average:");
        for(int w:arr){
            if(w>average){
                System.out.print(w+" ");
            }
        }
    }
}
