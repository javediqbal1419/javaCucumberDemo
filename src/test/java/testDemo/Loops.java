package testDemo;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int rate = 15;
        int maxHour = 40;
        System.out.println("Enter maximum hour :");
        Scanner scanner = new Scanner(System.in);
        double hourWorked = scanner.nextDouble();

        while (hourWorked > maxHour){
            System.out.println("Please enter the hour not more than 40 ");
            hourWorked = scanner.nextDouble();
        }
        scanner.close();
        double salary = maxHour*rate;
        System.out.println("The Salary is: "+salary);
    }
}
