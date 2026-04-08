package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter how many hours you've worked: ");
        double hours = scanner.nextDouble();

        System.out.println("Enter your pay rate: ");
        double payRate = scanner.nextDouble();
        scanner.nextLine();

        double grossPay;

        if(hours > 40) {
            grossPay = 40 * payRate;
            double overtime = hours - 40;
            grossPay = grossPay + (overtime * (payRate * 1.5));
            System.out.printf("%s worked %.2f hours for $%.2f dollars an hour. \n Your gross pay is $%.2f", name, hours, payRate, grossPay);
        }   else {
            grossPay = hours * payRate;
            System.out.printf("%s worked %.2f hours for $%.2f dollars an hour. \n Your gross pay is $%.2f", name, hours, payRate, grossPay);
        }
    }
}
