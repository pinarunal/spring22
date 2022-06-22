package practice08;

import java.util.Arrays;

public class Q02 {
    /*
     * Create a method accepts a name as parameter
     * and prints the name as a char array

     * (do not use toCharArray() method)

     * Input : John
     * Output : [J, o, h, n]
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(convertToCharArray("JohnDoe")) );
    }

    public static char[] convertToCharArray(String name){

        char[] arr=new char[name.length()];

        for(int i=0; i<name.length(); i++){
            arr[i]=name.charAt(i);
        }
        return arr;
    }

}
