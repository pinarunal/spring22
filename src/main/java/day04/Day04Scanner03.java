import java.util.Scanner;

public class Day04Scanner03 {
     /*
        Ask user to enter the width, length and the height of a rectangular prism then find the volume.
        Volume = width * length * height
     */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the width of the rectangular prism ");
         double width = input.nextDouble();
         System.out.println("Enter the length of the rectangular prism ");
         double length = input.nextDouble();
         System.out.println("Enter the height of the rectangular prism ");
         double height = input.nextDouble();

         System.out.println(width*length*height);



     }

}
