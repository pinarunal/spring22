package day29;

public class E01 {
    /*
    1) When do you use "throw" keyword?
       When we want to throw any exception in out method body, we use "throw" keyword.
       You can use "throw" keyword many times in a method.
        After using "throw" keyword, you must create an Exception Object("new" + "constructor" )

     */

   public static void main(String[] args) {
        try {
            setAge(-15);
        }catch (IllegalArgumentException e){
            System.err.println("Age can not be less than zero.");
        }

       System.out.println("Hello World");
   }

   public static void setAge(int age){

       if(age<0){

           throw new IllegalArgumentException();

       }else {

           System.out.println("The age is "+age);
       }
   }
}
