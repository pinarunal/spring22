package day30;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date01 {
    public static void main(String[] args) {

        //How to create date object
        LocalDate currentDate01 = LocalDate.now();
        System.out.println("currentDate01 = " + currentDate01);

        System.out.println(currentDate01.plusDays(5));
        System.out.println(currentDate01.plusMonths(3));
        System.out.println(currentDate01.plusYears(2));
        System.out.println(currentDate01.plusYears(1).plusMonths(2).plusDays(20));

        System.out.println(currentDate01.getYear());
        System.out.println(currentDate01.getMonth());
        System.out.println(currentDate01.getMonthValue());
        System.out.println(currentDate01.getDayOfMonth());
        System.out.println(currentDate01.getDayOfYear());
        System.out.println(currentDate01.getDayOfWeek());

        System.out.println(currentDate01.minusDays(2));
        System.out.println(currentDate01.minusYears(21));
        System.out.println(currentDate01.minusMonths(40));

        System.out.println(currentDate01.minusYears(5).minusMonths(5).minusDays(5));

        LocalDate date2 = LocalDate.of(1999,4,10);
        System.out.println(currentDate01.isAfter(date2));//true
        System.out.println(currentDate01.isBefore(date2));//false

        //How to create time object
        LocalTime currentTime1 = LocalTime.now();
        System.out.println("currentTime1 = " + currentTime1);

        for (int i = 0; i<2000000000; i++){

            i++;

        }

        LocalTime currentTime2 = LocalTime.now();
        System.out.println("currentTime2 = " + currentTime2);

        System.out.println("Difference : "+(currentTime2.getNano()-currentTime1.getNano()));


        System.out.println( currentTime1.plusHours(5));
        System.out.println( currentTime1.plusMinutes(30));
        System.out.println( currentTime1.plusSeconds(10));

        System.out.println(currentTime1.now(ZoneId.of("Japan")));
        System.out.println(currentTime1.now(ZoneId.of("America/Los_Angeles")));
        System.out.println(currentTime1.now(ZoneId.of("America/New_York")));
        System.out.println(currentTime1.now(ZoneId.of("Europe/Berlin")));
        System.out.println(currentTime1.now(ZoneId.of("Turkey")));

        //How to create an object from LocalDateTime

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("dateTime1 = " + dateTime1);

        LocalDateTime dateTime2 = LocalDateTime.now();
        System.out.println("dateTime2 = " + dateTime2);

        //How to format Date

        DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("dd/MM/yy");//M ==> Month, m ==> minutes
                                                                          //MMM ==> First 3 letters of the month
                                                                          //MMMM ==> Full name of the month
                                                                          //M ==> The number of month without 0 at the beginning.


        System.out.println(dtf1.format(currentDate01));

        DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("MM*dd*yy");
        System.out.println(dtf2.format(currentDate01));



        //How to format Time
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm a");//hh ==> am-pm time format
                                                                        //HH ==> 24 hours time format
                                                                        //a ==> to put AM or PM to the time

        System.out.println(dtf3.format(localTime));

        //How to find difference between two dates
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1453,5,29);

        int ageYear = Period.between(d2,d1).getYears();
        System.out.println("ageYear = " + ageYear);


    }
}
