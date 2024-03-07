import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

//        Requirements
//
//        Make the program general; that is, it should prompt for the following inputs and use those inputs in the calculations.
//
//        The annual interest rate
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the annual interest rate % growth? ");
        double annualInterestRate = scanner.nextDouble();

//        The initial amount of principal
        System.out.println("How much do you want to invest? ");
        double initialAmountOfPrincipal = scanner.nextDouble();

//        The number of years the money is to stay in the fund
        System.out.println("How many years are investing? ");
        int noOfYearsInTheFund = scanner.nextInt();

//
//        The output should include the following for each year:
//
//        The year number
//        The principal at the beginning of the year
//        The total amount of interest earned for the year
//        The principal at the end of the year
//
//        Sample Program Output
//
//        How much do you want to invest? 500
//        How many years are investing? 10
//        What is the annual interest rate % growth? 10

//        CurrentBalance * (1 + (QuarterlyInterestRate / 100))
        double currentBalance = initialAmountOfPrincipal;
        double quarterlyInterestRate = 1 + annualInterestRate/400;
        double quaterlyIncrease = currentBalance * quarterlyInterestRate;

        System.out.println("Calculating... ");

        for(int i = 1; i <= noOfYearsInTheFund; i++){
            System.out.println("Year "+ i +":");
            System.out.println("Began with: "+Math.round(currentBalance * 100.0) / 100.0);
            if(i == 1) {
                for (int j = 0; j < 3; j++) {
                    quaterlyIncrease = quaterlyIncrease * quarterlyInterestRate;
//                    System.out.println("quaterlyIncrease: " + quaterlyIncrease);
                }
            }else{
                for (int j = 0; j < 4; j++) {
                    quaterlyIncrease = quaterlyIncrease * quarterlyInterestRate;
//                    System.out.println("quaterlyIncrease: " + quaterlyIncrease);
                }
            }
            double earned = quaterlyIncrease - currentBalance;
            currentBalance = quaterlyIncrease;

            System.out.println("Earned: " + Math.round(earned * 100.0) / 100.0);
            System.out.println("Ended with: "+Math.round(quaterlyIncrease * 100.0) / 100.0);
        }
//
//        Calculating...
//        Year 1:
//        Began with $500.00
//        Earned $51.91
//        Ended with $551.91
//
//        Year 2:
//        Began with $551.91
//        Earned $57.30
//        Ended with $609.20
//
//        Year 3:
//        Began with $609.20
//        Earned $63.24
//        Ended with $672.44
//
//...
//

    }
}