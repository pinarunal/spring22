package day22;

public class Runner {
    /*
    1) "Method Overriding" means updating "method body" to make the implementation specific for the "Child Class"
    2) Mostly we do not touch access modifiers, and "return type" of the "overridden method"(The method in the parent class)
    3) In "Method Overriding" method name can not be changed.
       If you change the method name it means you are creating a new method.
    4) Inheritance is prerequisite for "Method Overriding". If there is not "parent-child" relationship, there will be no "Method Overriding"
    5) The method in child class is called "Overriding Method".
    6) Access modifier of "Overriding Method"  can not be narrower than the access modifier of "Overridden Method"
    7) Return type can not be narrower than the data returned
    8) Return type of "Overriding Method" can not be wider than @Override
       Note: Normally return type can be "Object" everytime but in "Method Overriding" it can be the return type of the "Overridden Method" at most.
        Example: The return of the "Overridden Method" is Mammal
        What can be the return type of the method produce a dog object ==> Mammal and Dog




     */
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.eat();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.giveBirth();

        Bird bird1 = new Bird();
        bird1.eat();


    }
}
