import java.util.Scanner;

public class Day10ForLoop05 {

    public static void main(String[] args) {

    /*
        Ask the user how many fibonacci numbers he wants to see.
        Then write the code that prints these fibonacci numbers.
        Example: if user enters 6 output will be 1 1 2 3 5 8
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers to see");
        int n = input.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for(int i=1; i<n-1; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }

    }
}
