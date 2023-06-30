package lv.acodemy;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random newRandom = new Random();
        int randomNumber = newRandom.nextInt(10);
        System.out.println("Number:" + randomNumber); //pokazivaet pravilnoe cislo

        // Task: If Statement
        // Write a program that checks if a given number is positive. If the number is positive, print "Number is positive."
        if (randomNumber >= 0) {
            System.out.println("This is positive number:" + randomNumber);
        } else {
            System.out.println("Incorrect value" + randomNumber);
        }

        //  Task: If-Else Statement
        //  Write a program that checks if a given number is even. If the number is even (chetnoe) / 2, print "Number is even." Otherwise, print "Number is odd."

        if (randomNumber % 2 == 0) {
            System.out.println("This number is even: " + randomNumber);
        } else {
            System.out.println("This number is add: " + randomNumber);
        }


        //   Task: If-Else Statement
        //    Write a program that checks if a given year is a leap year.
        //    If the year is a leap year, print "Leap year."
        //    Otherwise, print "Not a leap year."
        //    (A leap year is divisible by 4 but not divisible by 100, except if it is divisible by 400.)

        int randomNumber2 = newRandom.nextInt(2030);
        if (randomNumber2 % 4 == 0 && randomNumber2 % 100 != 0 && randomNumber2 % 400 == 0) {
            System.out.println(randomNumber2 + " is leap year.");
        } else {
            System.out.println(randomNumber2 + " is not a leap year.");
        }


     /*
     Task: If-Else-If Statement
     Write a program that checks the temperature in Celsius and prints a corresponding message based on the temperature range:
     If temperature is less than 0, print "Freezing cold!"
     If temperature is between 0 and 15, print "Chilly weather."
     If temperature is between 16 and 25, print "Comfortable temperature."
     If temperature is above 25, print "Hot weather!»
     */

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius:");
        int scannerNumber = newScanner.nextInt();
        if (scannerNumber < 0) {
            System.out.println("Freezing cold!");
        } else if (scannerNumber >= 0 && scannerNumber <= 15) {
            System.out.println("Chilly weather.");
        } else if (scannerNumber >= 16 && scannerNumber <= 25) {
            System.out.println("Chilly weather.");
        } else if (scannerNumber > 25) {
            System.out.println("Hot weather!");
        }

        //Task: If Statement
        //Write a program that checks if a given string is empty. If the string is empty, print "String is empty."

        String[] fruits = {};
        //String[] fruits = {"apple"};
        if (fruits.length == 0) {
            System.out.println("String is empty.");
        } else {
            System.out.println("String is not empty.");
        }

    }
}
