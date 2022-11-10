package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!text.equals("Stop")) {
            int currentNumber = Integer.parseInt(text);
            if (isLessThan(currentNumber, minNumber)) {
                minNumber = currentNumber;
            }
            text = scanner.nextLine();
        }
        System.out.println(minNumber);
    }


    private static boolean isLessThan(int num1, int num2) {
        return num1 < num2;
    }
}
