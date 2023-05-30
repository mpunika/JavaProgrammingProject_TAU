package tau_java.exercises;

import java.util.Scanner;

public class CalculateEmployeeGrossPay {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // get the number of hours worked
        System.out.print("Enter the number of hours worked : ");
        double hours_worked = scanner.nextDouble();

        // get the rate per hour
        System.out.print("Enter the rate per hour : ");
        double rateWorked = scanner.nextDouble();

        scanner.close();

        double grossPay = hours_worked * rateWorked ;

        System.out.println("The Gross Pay for the Employee is : "+grossPay);


    }
}
