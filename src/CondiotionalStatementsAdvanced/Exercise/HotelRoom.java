package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsQuantity = Integer.parseInt(scanner.nextLine());

        double priceForApartment = 0;
        double priceForStudio = 0;

        switch (month) {
            case "May":
            case "October":
                priceForStudio = 50;
                priceForApartment = 65;
                if (isBetweenSevenAndFourteen(nightsQuantity)) {
                    priceForStudio = calculatePriceWithDiscount(priceForStudio, 0.05);
                } else if (nightsQuantity > 14) {
                    priceForStudio = calculatePriceWithDiscount(priceForStudio, 0.30);
                }
                if (isNightsForApartmentMoreThanFourteen(nightsQuantity)) {
                    priceForApartment = calculatePriceWithDiscount(priceForApartment, 0.10);
                }
                break;
            case "June":
            case "September":
                priceForStudio = 75.20;
                priceForApartment = 68.70;
                if (nightsQuantity > 14) {
                    priceForStudio = calculatePriceWithDiscount(priceForStudio, 0.20);
                }
                if (isNightsForApartmentMoreThanFourteen(nightsQuantity)) {
                    priceForApartment = calculatePriceWithDiscount(priceForApartment, 0.10);
                }
                break;
            case "July":
            case "August":
                priceForStudio = 76;
                priceForApartment = 77;
                if (isNightsForApartmentMoreThanFourteen(nightsQuantity)) {
                    priceForApartment = calculatePriceWithDiscount(priceForApartment, 0.10);
                }
                break;
        }

        double totalPriceForStudio = priceForStudio * nightsQuantity;
        double totalPriceForApartment = priceForApartment * nightsQuantity;

        System.out.printf("Apartment: %.2f lv.", totalPriceForApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", totalPriceForStudio);
    }

    private static boolean isNightsForApartmentMoreThanFourteen(int number) {
        return number > 14;
    }

    public static double calculatePriceWithDiscount(double price, double discount) {
        return price - (price * discount);
    }

    private static boolean isBetweenSevenAndFourteen(int number) {
        return number > 7 && number <= 14;
    }



}


