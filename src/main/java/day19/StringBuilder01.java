package day19;

public class StringBuilder01 {
    /*
     1) String class is "immutable" but sometimes we need "mutable" Strings because of that
    Java created "StringBuilder" and "StringBuffer" classes.
     2) When you use "String str1 = "Java";  to create a string, Java creates a "String Pool" in
     Heap Memory and puts the str1 object inside the String Pool.
     3) When  you create a new String by using "String str2="Java";" Java will check the String Pool
     if there is an abject whose value is same, then Java does not create a new container. Just points
      the  existing one. Java does it to save memory.

     4) When  multiple pointers point the same object, any update on the object will affect  all Strings. We do not want it.
     To prevent all Strings to be updated Java created immutability.

     5) If you want to create  different objects with same value, you have to use new keyword like:
     "String u = new String("Jdbc");"

     6) If any object does not have any pointer, Garbage Collector will delete it automatically to make the memory clean.

     7) String Class, all Wrapper Classes are immutable.


     Note: If you use "==" to compare Strings, it will check i)Value ii)Address
           If both are same you will get true.

     Note: equals() method check just the values not the addresses. If the values are same you will get true.
           When we work with Strings, we work with values mostly, therefore we use equals() when we compare Strings.


     */
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3="Java";
        String str4="Java";

        str1="Apex";

        System.out.println(str1 == str2);

      String accountHolder1="Jack";
      String accountHolder2="Jack";
      String accountHolder3="Jack";


      String s = "Sql";
      s="MySql";

      String t = "Jdbc";

      String u = new String("Jdbc");

      System.out.println("== : "+(u == t));//false
      System.out.println("equals: "+u.equals(t));//true


     StringBuilder sb1=new StringBuilder("Tom");
     sb1.append("Hanks");
     System.out.println(sb1);

     String sObj1="Tom";
     sObj1=sObj1.concat("Hanks");
     System.out.println(sObj1);//TomHanks



        StringBuilder sb2=new StringBuilder("Hanks");

        int numOfChars=sb2.length();
        System.out.println(numOfChars);//5

        int capacitySb2= sb2.capacity();
        System.out.println("capacitySb2: "+capacitySb2);//21


        StringBuilder sb3 = new StringBuilder();
        int capacityOfEmptySb=sb3.capacity();
        System.out.println("capacityOfEmptySb: "+capacityOfEmptySb);
        sb3.append("12345678901234567").append("12345678901234567890");
        System.out.println("sb3.capacity: "+sb3.capacity());//70
        System.out.println("sb3.length: "+sb3.length());//37

        //How to decide the capacity
        StringBuilder sb4=new StringBuilder(5);
        sb4.append("123456789012").append("1");
        System.out.println("sb4.length: "+sb4.length());//6
        System.out.println("sb4.capacity: "+sb4.capacity());//12

        StringBuilder sb5=new StringBuilder("Java World");
        sb5.delete(4,sb5.length());
        System.out.println("sb5: "+sb5);

        StringBuilder sb6=new StringBuilder("Java World");
        sb6.deleteCharAt(4);
        System.out.println("sb6: "+sb6);//JavaWorld

        StringBuilder sb7=new StringBuilder("Java World");
        sb7.reverse();
        System.out.println("reversedSb7: "+sb7);//dlroW avaJ


        //How to convert a String to a StringBuilder
        String str="Java";
        StringBuilder sb8=new StringBuilder(str);
        sb8.reverse();
        System.out.println(str);//Java
        System.out.println(sb8);//avaJ

        StringBuilder sb9=new StringBuilder("Java is Good");
        String newStr=sb9.substring(5,7);//Methods come from "immutable class" can not update the original value even in mutable class.
        System.out.println("sb9: "+sb9);
        System.out.println("newStr: "+newStr);

    }
}
