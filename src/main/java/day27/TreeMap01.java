package day27;

import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) TreeMap is not thread-safe and synchronized
    2) TreeMap puts the elements in natural order.
    3) TreeMap does not accept "null" in key part
    4) TreeMap accepts multiple "null" in value part.
    5) TreeMap is the slowest map.
     */

    public static void main(String[] args) {
        TreeMap<Integer, String> tm=new TreeMap<>();

        tm.put(102, "Tom");
        tm.put(110, "Hanks");
        tm.put(105, "Tom Hanks");

      //  tm.put(null, "ABC"); //--> NullPointerException
        tm.put(102, null);
        tm.put(200, null);

        System.out.println(tm);
    }

}
