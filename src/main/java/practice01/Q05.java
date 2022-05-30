package practice01;

import java.util.Scanner;

public class Q05 {
       /*
       Type java code by using ternary. Ask user to enter two integers
       Write a program to print the maximum  one on the console.(Do not forget they may be equal)
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = scan.nextInt();
        System.out.println("Enter second integer");
        int b= scan.nextInt();

        System.out.println(a==b ? "They are equal" : a>b ?   "Maximum Value: "+a : "Maximum Value: "+b);

    }
}
