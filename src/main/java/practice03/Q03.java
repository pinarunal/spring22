package practice03;

import java.util.Scanner;

public class Q03 {
      /*
    Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
    A perfect number is a positive integer that is equal to the sum of all its proper divisors.
    6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check if it is perfect number or not");
        int num=scan.nextInt();
        int sum=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
               sum=sum+i;
            }
        }

        if(sum==num){
            System.out.println(num+" is Perfect Number");

        }else {
            System.out.println(num+"  is NOT Perfect Number");
        }

    }
}
