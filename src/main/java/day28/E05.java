package day28;

public class E05 {
    /*
    Note: If there is parent-child relationship between Exception Classes
            and you need to use multiple catch blocks, make the child first,
            otherwise you will get Compile Time Error.
     */

    public static void main(String[] args) {

        String str ="I love Java";

        getCharsFromStringByIndex(str, 4);//v

        getCharsFromStringByIndex(str,12);//StringIndexOutOfBoundsException

        String s = null;

        getCharsFromStringByIndex(s,1);//NullPointerException

    }

    public static void getCharsFromStringByIndex(String str, int idx){

        try{
            System.out.println(str.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Non-existing index was used in the String");

        }catch (RuntimeException e){

            System.out.println(" The other one ...");

        }finally {
            System.out.println("Break the connection");
        }

    }
}
