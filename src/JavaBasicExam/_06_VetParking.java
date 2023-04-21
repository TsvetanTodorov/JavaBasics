package JavaBasicExam;

import java.util.Scanner;

public class _06_VetParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            double dayPrice = 0;

            for (int currentHour = 1; currentHour <= hours; currentHour++) {

                if ((currentDay % 2 == 0) && (currentHour % 2 != 0)) {
                    dayPrice += 2.50;
                } else if ((currentDay % 2 != 0) && (currentHour % 2 == 0)) {
                    dayPrice += 1.25;
                } else {
                    dayPrice += 1.00;
                }
            }

            totalPrice += dayPrice;
            System.out.printf("Day: %d - %.02f leva\n", currentDay, dayPrice);
        }

        System.out.printf("Total: %.02f leva\n", totalPrice);

    }
}
