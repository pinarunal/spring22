package day20;

    /*
        1)Object-Oriented Programming Language(OOP) has 4 main principals
            i)Encapsulation   ii)Polymorphism   iii)Inheritance   iv)Abstraction
        2)Encapsulation: Data hiding
            i)Some data needs to be hidden like SSN, password, username...
            ii)By hiding some data we make our codes more readable
            iii)Encapsulation gives use flexibility
        3)How to hide data
          By using "private" access modifier, I can hide the data
        4)After hiding data how can you use it.
          After hiding data by the help of the getters I can access to encapsulated data
          Note: getter methods i)Should have "public" access modifier
                               ii)Its return type must be same with the data type of the variable
                               iii)getter methods are named like "get + capitalized variable name"
                                   But if the data type is boolean getter methods are named like "is + capitalized variable name"
                               iv)getter methods do not use any parameter because they return the value of existing variable
        5)After hiding data how can you update it.
          After hiding data by the help of the setters I can update the encapsulated data

        6)To do encapsulation follow the given 5 steps.
            1)Create private variables
            2)Create constructors you need
            3)Create getters
            4)Create setters
            5)Create toString()
            Note: In this class, getters and setters are called "Java Beans" as well
        7)If you do not create any setter() the class will be "immutable class"
     */

public class Student {

    //1)Create private variables
    private String name = "Tom Hanks";
    private int age = 13;
    private boolean successful = true;

    //2)Create constructors you need
    public Student() {
    }
    public Student(String name, int age, boolean successful) {
        this.name = name;
        this.age = age;
        this.successful = successful;
    }

    //3)Create getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isSuccessful() {
        return successful;
    }

    //4)Create setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    //5)Create toString()
    @Override //If you want to see object details on the console, create "toString()" method.
    public String toString() {
        return "Student:" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", successful=" + successful;
    }
}
