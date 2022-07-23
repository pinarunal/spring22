package Faizan;

public class SurviveMonkey {
    /*
    There is a lonely monkey on a small island.
    He needs to eat 4 bananas every day.
    There are just 165 bananas on that island.
    Create following variables and find how many days monkey can survive.
    -Use do while loop.
    -Use increment, decrement and if statements.
    -int numberOfBananas = 165, survivalDays = 0;
    -boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas =165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

        do {
            System.out.println("Monkey eats 4 bananas in a day");
            numberOfBananas-=4;
            survivalDays++;
            System.out.println("Remaining bananas: "+numberOfBananas);
            if(numberOfBananas<4) {
                monkeyAlive =false;
                System.out.println("Today is the day " + (survivalDays+1) + " and there isn't enough banana. So monkey has passed away! :(");
            }else{

                System.out.println("Today is the day " + survivalDays + " and monkey still lives.\n");

            }

        }while (monkeyAlive);

        System.out.println("\nTotal survival day of monkey :" + (survivalDays));
    }



}

