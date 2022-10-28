package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeNumbers = 0;
        int nonPrimeNumbers = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            if (isPrimeNumber(number)) {
                primeNumbers = primeNumbers + number;
            } else {
                nonPrimeNumbers = nonPrimeNumbers + number;
            }

            input = scanner.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d", primeNumbers);
        System.out.println();
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumbers);

    }

    private static boolean isPrimeNumber(int number) {
        boolean isPrime = false;
        for (int num = 2; num <= number / 2; num++) {
            if (number % num == 0) {
                isPrime = true;
                break;

            }
        }
        return !isPrime;
    }
}


