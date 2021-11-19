package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/input.txt"));

        Scanner input = new Scanner(System.in);
        String userName;
        //int raffleNum = rand.nextInt(1000);
        int raffleNum;
        Random rand = new Random();

        System.out.println("Would you like to check a raffle ticket or buy one? c/b");
        String raffleOpt = input.next();
        switch (raffleOpt) {
            case "c":
                //System.out.println("check");
            
                System.out.println("What is your name? ");
                userName = input.next();
                System.out.println("The name you entered is: " + userName);
                
                System.out.println("What is your 3-digit raffle ticket number? ");
                raffleNum = input.nextInt();
                System.out.println("The number you entered is: " + raffleNum);

                break;
            case "b":
                //System.out.println("buy");

                System.out.println("What is your name? ");
                userName = input.next();

                //System.out.println("The name you entered is: " + userName);

                raffleNum = rand.nextInt(1000);

                //System.out.println("The number you got is: " + raffleNum);

                System.out.println("Your raffle ticket is "+ userName + ":" + raffleNum);
                break;
        }

    }
}
