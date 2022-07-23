package Faizan;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    //Type code to print prime numbers up to 100.

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2;
        int counter = 0;
        while(num<100){

            for (int i = 2; i <=num; i++) {

                if(num%i==0){
                    counter++;
                }
            }

            if (counter==1) {
                primeNumbers.add(num);

            }
            num++;
            counter=0;
        }
        System.out.println("Prime numbers up to 100:\n"+primeNumbers);
    }
}
