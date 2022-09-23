package projectAtm;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> passData = new HashMap<>();
    boolean flag = true;


    public void login(){
        System.out.println("Hello, Welcome to ATM");


        do {

            passData.put(12345,1234);
            passData.put(23456,2345);
            passData.put(34567,3456);
            passData.put(45678,4567);
            passData.put(56789,4567);

            try{
                System.out.println("Enter account number");
                setAccountNumber(input.nextInt());
                System.out.println("Enter pin number");
                setPinNumber(input.nextInt());
            }catch (Exception e){
                System.out.println("You entered invalid character, please press 'Q' to exit or press any toher to continue");
                input.nextLine();//After nextInt, use empty nextLine() to use next()
                String exit = input.next();
                if(exit.equalsIgnoreCase("q")){

                    flag = false;

                }

            }

            int count = 0;
            for(Map.Entry<Integer, Integer> w : passData.entrySet()){

                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber()) ){

                    getAccountType();

                }else {
                    count++;
                }

            }
            if(count == passData.size()){

                System.out.println("Account number and Pin number is not matching");
                System.out.println("Press 'Q' to quit or press any other to try again");
                String exit = input.next();
                if(exit.equalsIgnoreCase("q")){
                    flag = false;
                }
            }

        }while (flag == true);

    }


    public void getAccountType(){
        System.out.println("Select the account you want to access");
        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Quit");

        int selection = input.nextInt();
        switch (selection){
            case 1:
                System.out.println("You are in checking account");
               checkingOperations();
                break;
            case 2:
                System.out.println("You are in saving account");
                savingOperations();
                break;
            case 3:
                System.out.println("Thanks for using ATM, See you later!!!");
                flag = false;
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2 or 3");
        }
    }

    public void checkingOperations(){

        do {
            System.out.println("Select Option");
            System.out.println("1: View Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");

            int option = input.nextInt();

            if(option==4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Your current balance: "+moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3 or 4");
            }
        }while (true);

        getAccountType();
    }


    public void savingOperations(){

        do {
            System.out.println("Select Option");
            System.out.println("1: View Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");

            int option = input.nextInt();

            if(option==4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Your current balance: "+moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3 or 4");
            }
        }while (true);

        getAccountType();
    }
}
























