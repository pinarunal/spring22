package practice06;

public class Q04 {
    /*
   Type a code to display the number of days in a given month of a given year.
       Example: The number of days in February 2000 was 29.
   */
    public static void main(String[] args) {
        int month=21;
        int year=7700;
        int numDay=0;

        switch(month){
            case 1: case 3:
            case 5: case 7:
            case 8: case 10:
            case 12:
                numDay=31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDay=30;
                break;
            case 2:
                if((year%4==0 && year%100!=0) || year%400==0){
                    numDay=29;
                }else {
                    numDay=28;
                }
                break;
            default:
                System.out.println("Enter a valid month number");

        }
        System.out.println("Number of days: "+numDay);

    }
}
