package day28;

public class E04 {
    //"try block" cannot be used alone, can be used with 1 or more catch blocks.
    //"try block" cannot be used alone, can be used without "catch block" with "finally block".

    public static void main(String[] args) {

        convertStringToIntegerThenDivideByGivenNum("123", 2);
        convertStringToIntegerThenDivideByGivenNum("123q", 3);//NumberFormatException  == Runtime Exception
        convertStringToIntegerThenDivideByGivenNum("100",0);
        convertStringToIntegerThenDivideByGivenNum("50",5);

    }

    public static void convertStringToIntegerThenDivideByGivenNum(String str, int num){
        try{

            System.out.println(Integer.parseInt(str) / num);

        }catch (NumberFormatException e){

            System.out.println("Issue occurred in conversion");


        }catch (ArithmeticException e){

            System.out.println("Issue occurred in division");
        }

    }

}