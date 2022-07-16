package day29;

public class E05 {
    /*
    What is the difference between ""Exception" and "Error"?
      "Exception"s  can be handled, your app can work after handling Exception.
      "Error"s can not be handled, your app can not work after getting any error.
   Note: Exceptions and Errors are child of "Throwable".
   Common Errors: i) OutOfMemory: It occurs if the Heap Memory is full.
                  ii) StackOverFlowError: It occurs if the Stack Memory is full.
                  iii) Linkage Error: It occurs if the "dependent" class has any issue.

  Custom Exception: We can create our own Exception Classes, they can be "Checked"(CTE) or "Unchecked"(Run Time) exception.
                    i) To be able to create Custom Exception, gives us flexibility.
                    ii) To be able to create Custom Exception, protect the application from developer mistakes.

     */

    public static void main(String[] args) throws IllegalGradeException, IllegalAgeException {

        int grade = 50;

        if(grade<0 || grade>100){

            throw new IllegalGradeException("Grades must be from zero to hundred");

        }else {
            System.out.println("Your grade is "+grade);
        }

        int age =-10;
        if(age<0){
            throw new IllegalAgeException("Age can not be negative");
        }else {
            System.out.println("Your age is "+age);
        }
    }

}


//How to create "Custom Checked Exception" class

/*
1) Make the class, child of the exception class
2) Use "String message" parameter in the "constructor"
3) Create "toString()" method to be able to see when the exception was thrown.


 */
class IllegalGradeException extends Exception{

    String message;

    public IllegalGradeException(String message){

        this.message = message;

    }
    public String toString(){
        return message;
    }
}
//How to create "Custom Un-Checked Exception" class

class IllegalAgeException extends RuntimeException{

    String message;

    public IllegalAgeException(String message){
        this.message = message;
    }
    public String toString(){
        return message;
    }
}