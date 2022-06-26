package day20;

import day21.Bird;
import day21.Cat;
import day21.Dog;

public class Runner {
    /*
    1)"private" class members can not be inherited by Child Class from Parent Class(impossible to inherit)
    2)"public" class members can be inherited.(Always can be inherited)
    3)"protected" class members can be inherited.(Always can be inherited)
    4)"default" class members can be inherited from  same package.(You can not inherit it from other packages)
     */


    /*
    Note 1: When we call a variable in a parent-child relationship look at the data type of the object
    Note 2: When we call a method in a parent-child relationship look at the constructor of object.
    Note 3: There is "IS-A" relationship from "child class" to "parent class".
    Note 4: There is "HAS-A" relationship from "parent class"  to "child class".
    Note 5: If there is no "parent-child relationship" you can not have "HAS-A"  or "IS-A" relationship.
     */


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.drink();
        cat1.eat();
        cat1.move();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.move();
        dog1.drink();
        dog1.volume();

        Bird bird1=new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.move();
        bird1.weight();

    }
}
