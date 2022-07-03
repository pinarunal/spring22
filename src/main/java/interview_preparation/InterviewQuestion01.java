package interview_preparation;

import java.util.Scanner;

public class InterviewQuestion01 {

    public static void main(String[] args) {

        //Ask user to enter 2 numbers then swap them
        // a=12 and b=13 ==> a=13 and b=12
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = input.nextDouble();

        System.out.println("Enter second number");
        double b = input.nextDouble();

        //1.Way:
        System.out.println(a + " - " + b);// 12 - 13
        double temp = 0;
        //I
        temp = b;
        //II
        b = a;
        //III
        a = temp;
        System.out.println(a + " - " + b);// 13 - 12

        //2.Way:
        System.out.println(a + " - " + b);//12 - 13
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " - " + b);//13 - 12

    }
}
