package practice08;

public class Q05_Runner {
    public static void main(String[] args) {
        Q05_Calculator obj1 = new Q05_Calculator();

        obj1.addition(6,4);
        obj1.addition(9);
        obj1.addition();
        obj1.subtraction(5,4);
        obj1.subtraction(5,-5);
        obj1.multiplication(3,4);
        obj1.multiplication(0,1,2,3,4,6);
        obj1.division(2,4);
        obj1.division(9,0);

    }
}
