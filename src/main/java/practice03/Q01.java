package practice03;

import java.util.Scanner;

public class Q01 {
    //Print numbers from given number till the next multiple of 10. e.g.,
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num=input.nextInt();

        while(num%10!=0){

            System.out.print(num+" ");
            num++;
        }

    }
}
