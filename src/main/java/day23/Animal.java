package day23;

public class Animal {

    public Animal(){
        System.out.println("Animal constructor worked...");
    }

    public Animal(String msg){
        this();
        System.out.println("Animal constructor with " + msg + " worked...");
    }

}
