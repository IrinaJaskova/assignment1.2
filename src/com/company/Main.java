package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter time");
        short time = input.nextShort();


        if (time <= 12 && time >= 0) {
            System.out.println("Good Morning Sunshine!");
        }
        if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
        }
        if (time >= 20 && time <= 24) {
            System.out.println("Good Evening. Get some rest!");
        }
        if (time > 24 || time < 0) {
            System.out.println("Please enter correct time between 0 and 24");
        }

    }
}

