package day30;

import java.util.ArrayList;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(2);


        System.out.println(list);//[5, 3, 7, 1, 9, 8, 2]

        //Print all elements with 3 added without using index
       for (int w : list){

           System.out.print(w+3+" ");//8 6 10 4 12 11 5

       }
        System.out.println();
        System.out.println(list);

        for (int w : list){

            w = w +3;
            System.out.print(w+" ");//8 6 10 4 12 11 5 ==> changes temporarily

        }
        System.out.println();
        System.out.println(list);

        //With the foreach loop, we can access all elements without using index. But we can not make permanent changes.

    }
}
