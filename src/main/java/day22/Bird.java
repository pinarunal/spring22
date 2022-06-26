package day22;

public class Bird extends Animal{

    @Override
    public Mammal createAnimal() {
        return super.createAnimal();
    }

    public void layEgg(){
        System.out.println("Birds lay eggs");

    }

}
