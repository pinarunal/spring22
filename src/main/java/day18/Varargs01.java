package day18;

public class Varargs01 {
    /*
    1)Varargs are used to handle multiple parameters in a single method.
    2)Any parameter can not be used after varargs
    3)Before varargs we can use parameters different from varargs
    4)You can not use more than one varargs in a method.
     */

    public static void main(String[] args) {

        System.out.println(add(5,10));//15
        System.out.println(add(1,2,3));//6
        System.out.println(add(5));//5
        System.out.println(add());//0

    }

    public static int add(int... a){
        int sum=0;
        for(int w: a){
            sum+=w;
        }
        return sum;
    }


}
