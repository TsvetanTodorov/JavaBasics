package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!text.equals("Stop")) {
            int currentNumber = Integer.parseInt(text);
            if (isMoreThan(currentNumber, maxNumber)) {
                maxNumber = currentNumber;
            }
            text = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }

    private static boolean isMoreThan(int num1, int num2) {
        return num1 > num2;
    }
}
