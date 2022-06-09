package practice04;

import java.util.Arrays;

public class Q08 {
    /*
      Write code to find the sum of the dollars and sum of the euros in the given string.
       */
    public static void main(String[] args) {
        String s = "$1 $12 €34 €56 $45 €78";
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        int sumOfDollars=0;
        int sumOfEuros=0;
        for(String w:arr){
            if(w.contains("$")){
                sumOfDollars=sumOfDollars+ Integer.valueOf(w.replace("$",""));
            }else{
                sumOfEuros=sumOfEuros+Integer.valueOf(w.replace("€",""));
            }

        }
        System.out.println("sumOfDollars: "+sumOfDollars);
        System.out.println("sumOfEuros: "+sumOfEuros);

    }
}
