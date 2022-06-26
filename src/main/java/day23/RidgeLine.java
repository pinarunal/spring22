package day23;

public class RidgeLine extends Truck{
    @Override
    public void engine() {
        System.out.println("RidgeLine uses 5.0 multi turbo engine...");
    }

    @Override
    public void fourWheels() {
        System.out.println("RidgeLine has 4 wheels...");
    }
}
