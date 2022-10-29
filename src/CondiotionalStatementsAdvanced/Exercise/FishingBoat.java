package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double leftMoney = 0;
        double rent = 0;

        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishermen <= 6) {
                    rent = rent - (rent * 0.10);
                } else if (fishermen <= 11) {
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                if (fishermen % 2 == 0) {
                    rent = rent - (rent * 0.05);
                }
                leftMoney = budget - rent;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                if (fishermen <= 6) {
                    rent = rent - (rent * 0.10);
                } else if (fishermen <= 11) {
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                    rent = rent - (rent * 0.05);
                }
                leftMoney = budget - rent;
                break;
            case "Winter":
                rent = 2600;
                if (fishermen <= 6) {
                    rent = rent - (rent * 0.10);
                } else if (fishermen <= 11) {
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                if (fishermen % 2 == 0) {
                    rent = rent - (rent * 0.05);
                }
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
}
