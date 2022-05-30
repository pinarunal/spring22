public class Day02MethodCreation {

    public static void main(String[] args) {

        System.out.println(addIntegers(12, 5));
        System.out.println(multiplyIntegers(8,5));
        System.out.println(subtractIntegers(12, 7));
        System.out.println(divideIntegers(24.6, 2));


    }

    //Create an addition method
    public static int addIntegers(int a, int b){
        return a + b;
    }
    //Create a multiplication method
    public static int multiplyIntegers(int a, int b){
        return a*b;
    }
    //Create a subtraction method
    public static int subtractIntegers(int a, int b){
        return a - b;
    }
    //Create a dynamic division method
    public static double divideIntegers(double a, int b) {
        return a / b;
    }

    //Note 1: If you use same data types for all values in a mathematical operation, the result
    //        will be in the same data type

    //Note 2: If you use different data types in a mathematical operation, the result
    //        will be in the largest data type. Example; double / int ==>> double

    /*
        What did we learn so far?
        1)How to create dynamic methods.
        2)How to use a method in "main method"
        3)How to print the result of the method on the console.
        4)How to decide return type when you create a method.
        5)How to work data types in mathematical operation
     */

}
