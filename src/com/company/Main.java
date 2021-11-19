package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Would you like to check a raffle ticket or buy one? c/b");
        String raffleOpt = input.next();
        switch (raffleOpt) {
            case "c":
                //System.out.println("check");

                System.out.println("What is your name? ");
                String userName = input.next();

                System.out.println("What is your 3-digit raffle ticket number? ");
                int raffleNum = rand.nextInt(1000);
                System.out.println(raffleNum);
                break;

            case "check":
                //System.out.println("check2");
                break;
            case "b":
                System.out.println("buy");
                break;
            case "buy":
                System.out.println("buy2");
                break;
        }

    }
}

// change 2