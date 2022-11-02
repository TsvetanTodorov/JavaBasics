package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int DAYS_OF_STAYING = Integer.parseInt(scanner.nextLine()) - 1;
        final String ROOM_TYPE = scanner.nextLine();
        final String GRADE = scanner.nextLine();

        final double PRICE_FOR_ROOM_FOR_ONE_PERSON = 18;
        final double PRICE_FOR_APARTMENT = 25;
        final double PRICE_FOR_PRESIDENT_APARTMENT = 35;
        double totalPrice = 0;

        switch (ROOM_TYPE) {
            case "room for one person":
                totalPrice = DAYS_OF_STAYING * PRICE_FOR_ROOM_FOR_ONE_PERSON;
                break;
            case "apartment":
                if (isLessThanTen(DAYS_OF_STAYING)) {
                    totalPrice = calculateTotalPrice(PRICE_FOR_APARTMENT, DAYS_OF_STAYING, 0.30);
                } else if (isLessThanFifteen(DAYS_OF_STAYING)) {
                    totalPrice = calculateTotalPrice(PRICE_FOR_APARTMENT, DAYS_OF_STAYING, 0.35);
                } else {
                    totalPrice = calculateTotalPrice(PRICE_FOR_APARTMENT, DAYS_OF_STAYING, 0.50);
                }
                break;
            case "president apartment":
                if (isLessThanTen(DAYS_OF_STAYING)) {
                    totalPrice = calculateTotalPrice(PRICE_FOR_PRESIDENT_APARTMENT, DAYS_OF_STAYING, 0.10);
                } else if (isLessThanFifteen(DAYS_OF_STAYING)) {
                    totalPrice = calculateTotalPrice(PRICE_FOR_PRESIDENT_APARTMENT, DAYS_OF_STAYING, 0.15);
                } else {
                    totalPrice = calculateTotalPrice(PRICE_FOR_PRESIDENT_APARTMENT, DAYS_OF_STAYING, 0.20);
                }
                break;
        }
        if (isPositive(GRADE)) {
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        System.out.printf("%.2f", totalPrice);
    }


    private static boolean isLessThanTen(int number) {
        return number < 10;
    }

    private static boolean isLessThanFifteen(int number) {
        return number < 15;
    }

    private static double calculateTotalPrice(double roomPrice, int days, double discount) {
        double totalCost = days * roomPrice;
        return totalCost - (totalCost * discount);
    }

    private static boolean isPositive(String grade) {
        return grade.equals("positive");
    }


}
