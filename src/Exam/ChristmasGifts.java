package Exam;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toyPrice = 5;
        int sweaterPrice = 15;

        int adultsCounter = 0;
        int kidsCounter = 0;
        int toysTotalPrice = 0;
        int sweatersTotalPrice = 0;

        String command = scanner.nextLine();

        while (!command.equals("Christmas")) {
            int familyPersonAge = Integer.parseInt(command);

            if (familyPersonAge <= 16) {
                kidsCounter++;
            } else {
                adultsCounter++;
            }
            command = scanner.nextLine();
        }

        toysTotalPrice = toyPrice * kidsCounter;
        sweatersTotalPrice = sweaterPrice * adultsCounter;

        System.out.printf("Number of adults: %d%n", adultsCounter);
        System.out.printf("Number of kids: %d%n", kidsCounter);
        System.out.printf("Money for toys: %d%n", toysTotalPrice);
        System.out.printf("Money for sweaters: %d", sweatersTotalPrice);

    }
}
