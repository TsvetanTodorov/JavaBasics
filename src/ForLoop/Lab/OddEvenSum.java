package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenNumbersSum += currentNumber;
            } else {
                oddNumbersSum += currentNumber;
            }
        }
        if (evenNumbersSum == oddNumbersSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenNumbersSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs((evenNumbersSum - oddNumbersSum)));
        }

    }


}