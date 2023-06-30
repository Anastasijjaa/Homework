package lv.acodemy;

import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

// Limit guess with 3 times;
        Scanner newScanner = new Scanner(System.in);
        Random newRandom = new Random();
        int randomNumber = newRandom.nextInt(5);
        System.out.println(randomNumber); //pokazivaet pravilnoe cislo
        System.out.println("Please enter number I guessed:");
        int scannerNumber = newScanner.nextInt();

        if (scannerNumber == randomNumber) {
            System.out.println("You guessed the number!");
        } else if (scannerNumber != randomNumber) {
            for (int schetchik = 3; schetchik > 0; --schetchik) {
                if (scannerNumber != randomNumber) {
                    System.out.println("Incorrect. Attempt: " + schetchik);
                    Scanner newScanner1 = new Scanner(System.in);
                    int scannerNumber1 = newScanner1.nextInt();
                    scannerNumber = scannerNumber1;
                }
            }
            if (scannerNumber == randomNumber) {
                System.out.println("Good job! You guessed the number!");
            } else {
                System.out.println("The END");
            }
        }


    }
}
