package practice01;

import java.util.Scanner;

public class Q04 {
    //Type a code that calculates the hypotenuse.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the first leg of the right triangle");
        double a = input.nextDouble();

        System.out.println("Enter the length of the second leg of the right triangle");
        double b = input.nextDouble();

        double hypotenuse = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse: "+hypotenuse);

    }
}
