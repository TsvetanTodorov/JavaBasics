package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        int sumWithoutMaxNumber = sum - maxNumber;
        if (maxNumber == sumWithoutMaxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNumber);
        } else {
            int diff = Math.abs(maxNumber - sumWithoutMaxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }


    }
}
