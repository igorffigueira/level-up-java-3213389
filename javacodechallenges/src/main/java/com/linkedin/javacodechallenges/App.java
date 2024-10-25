package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WaterMeter waterMeter = new WaterMeter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                waterMeter.calculateWaterBill(usage));
        scanner.close();
    }
}
