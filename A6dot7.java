/* Write a method that computes future investment value at a given 
interest rate for a specified number of years.
then prompt the user to enter the investment amount and the interest rate
and displays the values for every year for 30 years */

import java.util.Scanner;

public class A6dot7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;
        System.out.println("Years\tFuture Value");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-8d", years);
            System.out.printf("%-8.2f", futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
            System.out.println();
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
    
}
