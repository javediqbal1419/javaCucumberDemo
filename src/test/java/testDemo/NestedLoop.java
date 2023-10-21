package testDemo;

import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        int numberOfStudent = 2;
        int numberOfTest = 3;

        Scanner scanner = new Scanner(System.in);

        for (int i =0; i <numberOfStudent; i++){

            double total=0;
            for (int j=0; j<numberOfTest; j++){
                System.out.println("Enter the Score for Test # "+ (j+1));
                double score = scanner.nextDouble();
                total = total+score;

            }
            double average = total/numberOfTest;
            System.out.println("The Test average for Student #  "+(i+1)+ "  is "+average);
        }
    }
}
