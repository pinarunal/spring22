package practice09;

import java.util.ArrayList;
import java.util.List;

public class Q06 {
      /*
       Create a method to add 10 random integers from 0 to 20 into a List. Convert even numbers to 111.
       If there is no even number print on console "There is no even number".
      */

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        addRandomIntegers(list);
    }
    public static void addRandomIntegers(List<Integer> list){

        for(int i=1;i<=10;i++){

            list.add((int)(Math.random()*20));
        }
        System.out.println(list);
            int counter=0;
        for(int i =0; i< list.size();i++){
            if(list.get(i)%2==0){
                list.set(i,111);
                counter++;
            }
        }
        System.out.println(list);
        if(counter==0){
            System.out.println("There is no even number in the list");
        }

    }
}
