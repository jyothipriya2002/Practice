package com.homeDateTimeM13;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;

public class MallParkingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter In-Time (HH:MM): ");
        String inTimeString = sc.nextLine();
        System.out.println("Enter Out-Time (HH:MM): ");
        String outTimeString = sc.nextLine();
        
        try {
            LocalTime inTime = LocalTime.parse(inTimeString);
            LocalTime outTime = LocalTime.parse(outTimeString);

            if (!inTime.isBefore(outTime)) {
                System.out.println("Invalid input: In-Time must be earlier than Out-Time.");
                return;
            }

            Duration duration = Duration.between(inTime, outTime);
            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;

            long parkingFee = hours * 10;
            if (minutes > 0) {
                parkingFee += 10;
            }
            System.out.println("Total parking fee: " + parkingFee + " Rupees");
        } catch (Exception e) {
            System.out.println("Invalid input: Please enter the time in HH:MM format.");
        }
    }
}