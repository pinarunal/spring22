package practice10;

public class Q06_Runner {

    public static void main(String[] args) {

        Q06_Child obj = new Q06_Child();

        System.out.println("Area Of Rectangle: "+ obj.areaOfRectangle(5,4));
        System.out.println("Area Of Triangle: "+obj.areaOfTriangle(10,2));

        obj.multiplication(5,6);

    }
}
