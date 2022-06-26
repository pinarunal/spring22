package day22;

public class Animal {

    void eat(){//Overridden Method
        System.out.println("Animals eat");
    }

    public Mammal createAnimal(){

        return new Dog();
    }
}
