package day27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

    public static void main(String[] args) {

        //Type code to find the number of occurrences of letters in a String
        //"toms are phantoms." ==> t=2 o=2 m=2 s=2 a=2 r=1 e=1 p=1 h=1 n=1

        String s = "abaa";

        //Remove punctuation marks, spaces, digits and symbols.
       s = s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);

        //Get the characters one by one
        String[] letters= s.split("");
        System.out.println(Arrays.toString(letters));//[a, b, a, a]

        //Count the occurrences
        Map<String, Integer> result = new HashMap<>();

        for(String w: letters){

        Integer numOfOccurences=result.get(w);

        if(numOfOccurences == null){
            result.put(w,1);
        }else {
            result.put(w, numOfOccurences+1);
        }
      }
        System.out.println(result);
    }
}
