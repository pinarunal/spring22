package practice09;

public class Q03_Runner {

    public static void main(String[] args) {
        Q03_Volume volume=new Q03_Volume();
        System.out.println("Volume Of Cylinder:"+ volume.volumeOfCylinder(5, 10));
        System.out.println("Volume Of Rectangular Prism: "+volume.volumeOfRectangularPrism(4,5,11.5));
    }
}
