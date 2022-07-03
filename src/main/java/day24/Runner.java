package day24;

public class Runner {
    public static void main(String[] args) {

        Civic civic=new Civic();
        System.out.println(civic.number);
        System.out.println(HondaAC.price);
        System.out.println(Engine.price);


        //When you create a method with body by using "default" keyword,  you can access it just by creating object.
        civic.bacteriaKiller();


        //When you create a method with body by using "static" keyword,  you can access it just by using interface name.
        HondaAC.climateCool();



        Pilot pilot = new Pilot();
        pilot.cool();

        Accord accord = new Accord();
        accord.run();


    }
}
