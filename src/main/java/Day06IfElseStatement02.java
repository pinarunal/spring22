import java.util.Scanner;

public class Day06IfElseStatement02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = input.next();

        //Ask user to enter the password then check if the password is valid or not according to the given rules
        //1)At least 8 characters   2)Contains at least 1 uppercase     3)Contains at least 1 lowercase     4)Contains at least 1 symbol(different from letters and digits)
        //1.Way:
        if(pwd.length()<8){
            System.out.println("Password is invalid because it does not have at least 8 characters");
        }else if((pwd.replaceAll("[^A-Z]", "")).length()==0){
            System.out.println("Password is invalid because it does not have any uppercase");
        }else if((pwd.replaceAll("[^a-z]", "")).length()==0){
            System.out.println("Password is invalid because it does not have any lowercase");
        }else if((pwd.replaceAll("[A-Za-z0-9]", "")).length()==0){
            System.out.println("Password is invalid because it does not have any symbol");
        }else{
            System.out.println("Password is valid, welcome to Chase Bank");
        }

        System.out.println("=============================");

        //2.Way:
        if(pwd.length()<8){
            System.out.println("Password is invalid because it does not have at least 8 characters");
        }
        if((pwd.replaceAll("[^A-Z]", "")).length()==0){
            System.out.println("Password is invalid because it does not have any uppercase");
        }
        if((pwd.replaceAll("[^a-z]", "")).length()==0){
            System.out.println("Password is invalid because it does not have any lowercase");
        }
        if((pwd.replaceAll("[A-Za-z0-9]", "")).length()==0){
            System.out.println("Password is invalid because it does not have any symbol");
        }
    }
}
