package day30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(2);

        System.out.println(list);//[   5,    3,    7,    1,    9,    8,    2   ]

        Iterator<Integer> ite1 =  list.iterator();

        for(int i = 0; i<list.size(); i++){

            System.out.println(ite1.hasNext()+"======"+ite1.next());

        }

        //hasNext() ==> Returns true if the iteration has more elements
        //next() ==> Returns the next element in the iteration

        System.out.println(ite1.hasNext());//false
        System.out.println(ite1.next());//java.util.NoSuchElementException

    }
}
