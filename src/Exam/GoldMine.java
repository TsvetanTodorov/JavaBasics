package Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int locationsQuantity = Integer.parseInt(scanner.nextLine());
        int totalGoldPerLocation = 0;
        double averageGoldPerLocation = 0;

        while (locationsQuantity > 0) {

            int expectedGoldPerDay = Integer.parseInt(scanner.nextLine());
            int workingDaysPerLocation = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= workingDaysPerLocation; i++) {
                int gatheredGoldPerDay = Integer.parseInt(scanner.nextLine());
                totalGoldPerLocation += gatheredGoldPerDay;
            }
            averageGoldPerLocation = (double) totalGoldPerLocation / workingDaysPerLocation;
            if (averageGoldPerLocation >= expectedGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerLocation);
            } else {
                double neededGold = expectedGoldPerDay - averageGoldPerLocation;
                System.out.printf("You need %.2f gold.%n", neededGold);
            }
            locationsQuantity--;
            totalGoldPerLocation = 0;
        }
    }
}
