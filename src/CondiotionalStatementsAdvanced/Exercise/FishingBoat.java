package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    private static final double SPRING_RENT = 3000;
    private static final double SUMMER_AND_AUTUMN_RENT = 4200;
    private static final double WINTER_RENT = 2600;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double leftMoney = 0;
        double rent;

        switch (season) {
            case "Spring":
                rent = calculateRentAfterDiscount(fishermen, SPRING_RENT, season);
                leftMoney = budget - rent;
                break;
            case "Summer":
            case "Autumn":
                rent = calculateRentAfterDiscount(fishermen, SUMMER_AND_AUTUMN_RENT, season);
                leftMoney = budget - rent;
                break;
            case "Winter":
                rent = calculateRentAfterDiscount(fishermen, WINTER_RENT, season);
                leftMoney = budget - rent;
                break;
        }

        if (leftMoney >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double neededMoney = Math.abs(leftMoney);
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }


    private static double calculateRentAfterDiscount(int fishermen, double rent, String season) {
        double rentAfterDiscount;
        if (fishermen <= 6) {
            rentAfterDiscount = rent - (rent * 0.10);
        } else if (fishermen <= 11) {
            rentAfterDiscount = rent - (rent * 0.15);
        } else {
            rentAfterDiscount = rent - (rent * 0.25);
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            rentAfterDiscount = rent - (rent * 0.05);
        }
        return rentAfterDiscount;
    }


}