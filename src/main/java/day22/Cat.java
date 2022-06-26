package day22;

public class Cat extends Mammal{

    @Override
     protected void eat() {//Overriding Method
        System.out.println("Cats eat");

    }

    @Override//Checks the Overriding Rules
    public Mammal createAnimal() {

        return new Cat();
    }
}