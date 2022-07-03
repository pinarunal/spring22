package practice10;

public class Q06_Child extends Q06_Area{


    @Override
    double areaOfRectangle(double width, double height) {
        return width*height;
    }

    @Override
    double areaOfTriangle(double base, double height) {
        return base*height/2;
    }


}
