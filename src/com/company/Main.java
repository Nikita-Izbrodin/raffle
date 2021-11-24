package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean loop = true;

        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String userName;

        Random rand = new Random();
        int raffleNum;

        System.out.println("Would you like to check a raffle ticket or buy one? c/b");
        String raffleOpt = input.readLine();

        switch (raffleOpt) {

            case "c" -> { // start of case "c"
                System.out.println("What is your name? ");
                userName = input.readLine();

                while (loop) {
                    try {
                        System.out.println("What is your 3-digit raffle ticket number? ");
                        raffleNum = Integer.parseInt(input.readLine());
                        loop = false;
                        System.out.println("The raffle you entered is " + userName + ":" + raffleNum);
                    } catch (Exception e) {
                        System.out.println("You did not enter a number.");
                    }
                }

                // end of case "c"
            }

            case "b" -> { // start of case "b"
                System.out.println("What is your name? ");
                userName = input.readLine();

                raffleNum = rand.nextInt(1000);

                System.out.println("Your raffle is " + userName + ":" + raffleNum);

                // end of case "b"
            }
        }
    }
}
