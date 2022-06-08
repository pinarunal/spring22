import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop02 {

    public static void main(String[] args) {

        //Sort the array elements according to their lengths.
        //[ "Michael", "Ali", "Maria", "Veli" ] ==> "Ali" - "Veli" - "Maria" - "Michael"

        String arr[] = { "Michael", "Ali", "Maria", "Veli" };
        System.out.println(Arrays.toString(arr));//[ "Michael", "Ali", "Maria", "Veli" ]
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));// [ "Ali", "Veli", "Maria", "Michael" ]

        //Sort the array elements according to their lengths in descending order.
        //[ "Michael", "Ali", "Maria", "Veli" ] ==> "Michael" - "Maria" - "Veli" - "Ali"
        String brr[] = {"Jackson", "Tom", "Dustin", "Mary", "Marian"};
        System.out.println(Arrays.toString(brr));//[Jackson, Tom, Dustin, Mary, Marian]
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));//[Jackson, Dustin, Marian, Mary, Tom]

        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order
        //[ "Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson"]
        String crr[] = { "Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson" };
        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        //Note: "natural order" means "alphabetical order" for Strings and "ascending order" in numbers
    }
}
