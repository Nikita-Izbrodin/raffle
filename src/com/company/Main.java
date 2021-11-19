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

        Random rand = new Random();
        int raffleNum;

        System.out.println("Would you like to check a raffle ticket or buy one? c/b");
        String raffleOpt = input.next();

        switch (raffleOpt) {

            case "c":
                System.out.println("What is your name? ");
                userName = input.next();

                System.out.println("What is your 3-digit raffle ticket number? ");
                raffleNum = input.nextInt();

                System.out.println("The raffle you entered is " + userName + ":" + raffleNum);

                break;

            case "b":
                System.out.println("What is your name? ");
                userName = input.next();

                raffleNum = rand.nextInt(1000);

                System.out.println("Your raffle is " + userName + ":" + raffleNum);

                break;
        }

    }
}
