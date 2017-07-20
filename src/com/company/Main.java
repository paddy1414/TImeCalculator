package com.company;


import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        long finalMills;
	// write your code here
        int hoursIn;
        int mins;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total hours");
        hoursIn = sc.nextInt();

        int input;
        System.out.println("please enter the minutes");
        mins =sc.nextInt();

        int firstMins =  mins +(hoursIn*60);

        long firstMils = TimeUnit.MINUTES.toMillis(firstMins);
        System.out.println(firstMils + " first mili");
        System.out.println("firstMins mins" + firstMins);
    //    String sdf = new SimpleDateFormat("dd H:mm").format(new Date(firstMils));


    String sdf=    String.format("%d hour, %d minute",
                TimeUnit.MILLISECONDS.toHours(firstMils),
                TimeUnit.MILLISECONDS.toMinutes(firstMils) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toHours(firstMils))
        );
        System.out.println(sdf);
        System.out.println();
        System.out.println("would you like to");
        System.out.println("1 add two dates");
        System.out.println("2 subtract two dates");
        System.out.println("3 multiply two dates");
        System.out.println("4 find a percentage complete two dates");
        System.out.println("5 exit");
         input = sc.nextInt();

        if (input ==1 ) {

            System.out.println("Please enter the total hours");
            hoursIn = sc.nextInt();

            System.out.println("please enter the minutes");
            mins =sc.nextInt();

            int secondMins =  mins +(hoursIn*60);

            long secondMili = TimeUnit.MINUTES.toMillis(secondMins);

            System.out.println("...adding......");

            long finalMili = secondMili + firstMils;
            String sb = String.format("%d hour, %d minute",
                    TimeUnit.MILLISECONDS.toHours(finalMili),
                    TimeUnit.MILLISECONDS.toMinutes(finalMili) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toHours(finalMili))
            );
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(sb.toString());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");


        }else if (input==2) {

            System.out.println("Please enter the total hours");
            hoursIn = sc.nextInt();

            System.out.println("please enter the minutes");
            mins =sc.nextInt();

            int secondMins =  mins +(hoursIn*60);

            System.out.println("second mins" + secondMins);
            long secondMili = TimeUnit.MINUTES.toMillis(secondMins);

            System.out.println("...subtracting......");
            finalMills = firstMils- secondMili ;
            String sb = String.format("%d hour, %d minute",
                    TimeUnit.MILLISECONDS.toHours(finalMills),
                    TimeUnit.MILLISECONDS.toMinutes(finalMills) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toHours(finalMills))
            );
            System.out.println("---------------------------------------------------");
            System.out.println(sb.toString());
            System.out.println("---------------------------------------------------");
        }else if (input== 3 ) {

            System.out.println("Please enter the total hours");
            hoursIn = sc.nextInt();

            System.out.println("please enter the minutes");
            mins =sc.nextInt();

            int secondMins =  mins +(hoursIn*60);

            long secondMili = TimeUnit.MINUTES.toMillis(firstMins);

            System.out.println("...multipling......");
            finalMills = secondMili * firstMils;

            String sb = String.format("%d hour, %d minute",
                    TimeUnit.MILLISECONDS.toHours(finalMills),
                    TimeUnit.MILLISECONDS.toMinutes(finalMills) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toHours(finalMills))
            );
            System.out.println("***************************************************");
            System.out.println(sb.toString());
            System.out.println("***************************************************");

        }else if (input == 4) {
            System.out.println("Please enter hours of the percentage");
            hoursIn = sc.nextInt();

            System.out.println("please enter the minutes of the percentage");
            mins =sc.nextInt();

            int secondMins =  mins +(hoursIn*60);

            long secondMili = TimeUnit.MINUTES.toMillis(secondMins);
            System.out.println(secondMili +" second mili");
            System.out.println("...percentage......");
            finalMills = ( secondMili/firstMils) *100;
            float percentMili = (float) (secondMili*100) /firstMils;

            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println(percentMili +" Percentage");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        }
    }


}
