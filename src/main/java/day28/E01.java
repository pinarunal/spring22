package day28;

public class E01 {
    /*

    1) Exception is un-expected issue
    2) There are 2 ways to work with Exceptions
       i) Throw Exception ==> Asking Help
       ii) Handle Exception ==> Doing it yourself without asking help.
    3) Mainly, there are 2 types pf exceptions
        i) Runtime Exception ==> You will see them after clicking "run" button.
        ii)Compile Time Exception ==> You will see it  while you type your code.

     */

    public static void main(String[] args) {



        divide(20, 5);//4
        divide(0,23);//0
        divide(39,0);//ArithmeticException
        divide(10,2);//5
    }

    public static void divide(int a, int b){

      /*   if(b!=0){
        System.out.println(a/b);
        }else {                                            --- This is NOT Recommended ---
            System.out.println("Divider can not be Zero");
        }*/

        try{

            System.out.println(a/b);

        }catch (ArithmeticException e){
            System.out.println("A math rule was broken");
            System.err.println(e.getMessage());/// by zero
            e.printStackTrace();//java.lang.ArithmeticException: / by zero ...

        }
    }
}
