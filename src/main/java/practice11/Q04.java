package practice11;

import java.util.HashMap;
import java.util.Map;

public class Q04 {
      /*
        Print two arrays which contains firstname and lastname as the format : firstname=lastname
            input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
            output : {John=Doe, Mark=Twain, Ali=Can};
         */
      public static void main(String[] args) {

          String[] firstname={"John", "Mark", "Ali"};

          String[] lastname={"Doe", "Twain", "Can"};

          Map<String, String> fullName = new HashMap<>();

          for(int i=0;i<firstname.length; i++){

              fullName.put(firstname[i],lastname[i]);

          }
          System.out.println("Full Name: "+fullName);//{John=Doe, Mark=Twain, Ali=Can}

      }

}
