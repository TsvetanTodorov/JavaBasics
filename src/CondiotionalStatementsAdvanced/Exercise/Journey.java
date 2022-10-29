package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;


public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double price = 0;
        String typeOfVacation = "";

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    typeOfVacation = "Camp";
                    price = budget * 0.30;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    typeOfVacation = "Camp";
                    price = budget * 0.40;
                } else {
                    destination = "Europe";
                    typeOfVacation = "Hotel";
                    price = budget * 0.90;
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    typeOfVacation = "Hotel";
                    price = budget * 0.70;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    typeOfVacation = "Hotel";
                    price = budget * 0.80;
                } else {
                    destination = "Europe";
                    typeOfVacation = "Hotel";
                    price = budget * 0.90;
                }
                break;
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", typeOfVacation, price);
    }
}
