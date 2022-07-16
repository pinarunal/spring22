package day28;

public class E03 {
    public static void main(String[] args) {
        String str = "Java is easy";
        getNumOfCharsInString(str);//12

        String str2="";
        getNumOfCharsInString(str2);//0

        String str3 = null;

        getNumOfCharsInString(str3);//NullPointerException ==> Run Time Exception

    }

    public static void getNumOfCharsInString(String s){


        try {

            System.out.println(s.length());

        }catch (RuntimeException e){

            System.err.println(e.getMessage()+" ==> length() method was used with null String");

        }

    }

}