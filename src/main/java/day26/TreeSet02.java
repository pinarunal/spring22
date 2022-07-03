package day26;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
    /*
        Question: What do you do to store unique elements in natural order?
                  I use TreeSet
        Question: As you know TreeSet is so slow in adding and removing elements, what do you do to make it fast?
                  i)Create a HashSet
                  ii)Add the elements into HashSet
                  iii)Convert HashSet to TreeSet
     */

    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        TreeSet<String> tSet2 = new TreeSet<>();
        //1.Way
        long time1 = System.nanoTime();
        hSet.add("A");
        hSet.add("C");
        hSet.add("B");
        hSet.add("T");
        hSet.add("M");
        TreeSet<String> tSet1 = new TreeSet<>(hSet);
        long time2 = System.nanoTime();

        //2.Way
        tSet2.add("A");
        tSet2.add("C");
        tSet2.add("B");
        tSet2.add("T");
        tSet2.add("M");
        long time3 = System.nanoTime();

        System.out.println("HashSet + TreeSet: " + (time2 - time1));
        System.out.println("TreeSet: " + (time3 - time2));
    }
}
