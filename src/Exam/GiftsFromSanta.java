package Exam;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int questionNumber = Integer.parseInt(scanner.nextLine());

        for (int i = secondNumber; i >= firstNumber; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == questionNumber) {
                    return;
                }
                System.out.print(i + " ");
            }

        }

    }
}
