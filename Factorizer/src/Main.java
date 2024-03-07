import java.util.Scanner;
// The program calculates the factors of a user input int number
public class Main {

    public static void arrPrint(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // getting number from user
        System.out.println("What number would you like to factor? ");
        int number = scanner.nextInt();

        // calculating the total number of factors
        int noFactors = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                noFactors++;
            }
        }

        //defining array size of no. of factors
        int[] factorArray = new int[noFactors];

        // adding factors to the array
        int j = 0;
        int sumOfFactors = -number;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorArray[j] = i;
                j++;
                sumOfFactors += i;
            }
        }
        System.out.println("The sum of factors is: "+sumOfFactors);
        System.out.println(number + " has "+noFactors+" factors");
        arrPrint(factorArray);

        // check if the number is prime
        if(noFactors > 2){
            System.out.println(number + " is not a prime number.");
        } else {
            System.out.println(number + " is a prime number.");
        }

        // check if the number is perfect
        if (sumOfFactors == number){
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}