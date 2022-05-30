public class Day04Operations {
    /*
    Operations in Java
    1) +,-,*;/
        Order of operation: i)Operation inside parenthesis
                            ii) Multiplication and division
                            ii)Additions and subtractions

    2)Increment and Decrement operations
            Increment ==> Addition and Multiplication
            Decrement ==> Subtraction and Division

    3)Comparison Operator
    >, <, >=, <=, ==, !=
    Note: In math, single equal sign'='means equality but in Java equal sign '==' means equality.
    Note: In Java, '!' means 'not' so '!=' means not equal.
    Note: All comparison operators return boolean

    4)Logical Operators
    i) AND Operator : && ==>This operator is used between two boolean value
        true && true ==> true
        true && false ==> false
        false && true ==> false
        false && false ==>false
    ii) OR Operator : || ==> This operator is used between two boolean value
        true || ture ==> true
        ture || false ==> true
        false || true ==> true
        false || false ==> false

     */

    public static void main(String[] args) {

        int result = 10 - 6/( 2 + 5/5) + 7;
        System.out.println(result);

        int a = 12;
         // a=a+3;
         a += 3; //+= mean increase the value by the right saide of "="
        System.out.println(a);


        int b = 4;
        //   b=b*3;
         b *= 3;

        System.out.println(b);

        //Decrement

        int c = 18;
        c -= 3;
        System.out.println(c);//15

        int d = 24;
        d /= 6;
        System.out.println(d);//4

        //Increment and Decrement by 1
        int e = 12;
        e = e+1;
        e += 1;
        e++;// ==> Increment by 1
        System.out.println(e);

        int f = 13;
        f = f-1;
        f -=1;
        f--; // ==> Decrement by 1
        System.out.println(f);

        //Comparison Operator
        int h=12;
        int i=13;
        System.out.println(h<i);

        System.out.println(h==i);

        System.out.println(h<=i);

        System.out.println(h!=i);

        //Logical Operator

        System.out.println(3<4 && 5>1);
        System.out.println(3>4 && 5>1);


        System.out.println(5>4 || 5>6);
        System.out.println(1<3 || 1>1);


        //Post - increment and pre - increment

        //Post-increment
        int x = 12;
        int y = x++;

        System.out.println(y);
        System.out.println(x);


        //Pre-increment

        int m = 12;
        int n = ++m;

        System.out.println(n);



    }
}
