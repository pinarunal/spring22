package Faizan;

import java.util.Scanner;

public class AtbashCode {
    /*
      Ask user to enter a String and encrypt it by using Atbash Code.

      The Atbash Cipher is a simple substitution cipher that is sometimes called mirror code.
      To use Atbash, reverse the alphabet, so A encodes to Z, B to Y and so on.
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //1st Way:
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";
        System.out.print("Enter the String to encrypt");
        String str3 =scan.nextLine().toLowerCase();
        for (int i = 0; i < str3.length(); i++) {
            for (int j = 0; j<26; j++){
                if (str3.charAt(i)==str1.charAt(j)){

                    System.out.print(str2.charAt(j));
                }
            }
        }

        System.out.println("\n==========================");

        //2nd Way:
        System.out.print("Enter the String to encrypt");
        String str = scan.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++){
            int index = 'z'-str.charAt(i);
            System.out.print((char)(('a') + index));
        }
    }
}