package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to check a raffle ticket or buy one? c/b");
        String raffleOpt = input.next();
        switch (raffleOpt) {
            case "c":
                System.out.println("check");
                break;
            case "check":
                System.out.println("check2");
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
