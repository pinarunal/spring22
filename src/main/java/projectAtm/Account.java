package projectAtm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

   private int accountNumber;
   private int pinNumber;
   private double checkingBalance;
   private double savingBalance;

   DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
   Scanner input = new Scanner(System.in);


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    //Calculate checking balance after withdraw

    private double withDrawCheckingBalance(double amount){

        checkingBalance = checkingBalance - amount;
        return checkingBalance;

    }

    //Calculate checking balance after deposit

    private double depositCheckingBalance(double amount){

        checkingBalance = checkingBalance + amount;
        return checkingBalance;

    }

    //Calculate saving balance after withdraw

    private double withDrawSavingBalance(double amount){

        savingBalance = savingBalance - amount;
        return savingBalance;

    }

    //Calculate saving balance after deposit

    private double depositSavingBalance(double amount){

        savingBalance = savingBalance + amount;
        return savingBalance;

    }

    //Interact with customer to withdraw checking account
    public void getCheckingWithdraw(){

        System.out.println("Your checking account : "+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you want to withdraw");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Negative or zero amount is not acceptable");
            getCheckingWithdraw();
        } else if (checkingBalance>=amount) {

            withDrawCheckingBalance(amount);
            System.out.println("Your checking account : "+moneyFormat.format(checkingBalance));

        }else {
            System.out.println("You don't have enough money to withdraw");
            getCheckingWithdraw();
        }
    }

    //Interact with customer to deposit checking account
    public void getCheckingDeposit(){
        System.out.println("Your checking account : "+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you want to deposit");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("Negative or zero amount is not acceptable");
            getCheckingDeposit();

        }else {
            depositCheckingBalance(amount);
            System.out.println();
            System.out.println("Your checking account : "+moneyFormat.format(checkingBalance));
        }

    }

    //Interact with customer to withdraw saving account
    public void getSavingWithdraw(){

        System.out.println("Your saving account : "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you want to withdraw");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Negative or zero amount is not acceptable");
            getSavingWithdraw();
        } else if (checkingBalance>=amount) {

            withDrawSavingBalance(amount);
            System.out.println("Your saving account : "+moneyFormat.format(savingBalance));

        }else {
            System.out.println("You don't have enough money to withdraw");
            getSavingWithdraw();
        }
    }

    //Interact with customer to deposit saving account
    public void getSavingDeposit(){
        System.out.println("Your checking account : "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you want to deposit");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("Negative or zero amount is not acceptable");
            getSavingDeposit();

        }else {
            depositSavingBalance(amount);
            System.out.println();
            System.out.println("Your checking account : "+moneyFormat.format(savingBalance));
        }

    }

}