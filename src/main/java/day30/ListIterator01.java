package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {
    public static void main(String[] args) {

        List<String > list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Hayriye");

        System.out.println(list);//[   Ali,    Veli,    Ayse,    Fatma,    Hayriye   ]

        //Change all names with X added without using index.

        ListIterator<String > listIte1 = list.listIterator();

        while (listIte1.hasNext()){

            listIte1.set(listIte1.next()+"X");//set() ==> Replaces the last element returned by next or previous with the specified element.

        }

        System.out.println(list);

        listIte1.next();//NoSuchElementException

    }
}
