package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFlower = scanner.nextLine();
        int flowersQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double price = 0;

        switch (typeOfFlower) {
            case "Roses":
                price = 5;
                totalPrice = price * flowersQuantity;
                if (flowersQuantity > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                price = 3.80;
                totalPrice = price * flowersQuantity;
                if (flowersQuantity > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                price = 2.80;
                totalPrice = price * flowersQuantity;
                if (flowersQuantity > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                price = 3;
                totalPrice = price * flowersQuantity;
                if (flowersQuantity < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                price = 2.50;
                totalPrice = price * flowersQuantity;
                if (flowersQuantity < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                    break;
                }
        }
        double leftMoney = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersQuantity,
                    typeOfFlower, leftMoney);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", leftMoney);
        }
    }
}
