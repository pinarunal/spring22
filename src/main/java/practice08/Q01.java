package practice08;

public class Q01 {
         /*
      Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         */
    public static void main(String[] args) {

        myMethod(7,4,6,-7,100);
        myMethod(0, 1111111,4,6,8888);
        myMethod(-1, 5,7,23,6);

    }
    public static void myMethod( int a,int... numbers){

        int sum=0;
        for(int w:numbers){

            sum = sum + w;
        }
        System.out.println(sum * a);
    }

}
