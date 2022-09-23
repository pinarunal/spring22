package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LisIterator02 {
    public static void main(String[] args) {

        List<String > list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Hayriye");

        System.out.println(list);//[   Ali,    Veli,    Ayse,    Fatma,    Hayriye   ]

        //Print all elements in reverse order by using iterator.
        ListIterator<String> listIte1 = list.listIterator();

        while (listIte1.hasNext()){

            listIte1.next();//This code moves the pointer to the end.
        }

        while (listIte1.hasPrevious()){

            System.out.print(listIte1.previous()+" ");

        }

    }
}
