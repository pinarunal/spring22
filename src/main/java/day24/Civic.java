package day24;

//To make interfaces parent of a concrete class, use "implements" keyword instead of "extends".
public class Civic implements HondaAC, Engine, Security  {


    @Override
    public void cool() {

        System.out.println("Civic uses AC");
    }

    @Override
    public void run() {

        System.out.println("AC runs well");

    }

}
