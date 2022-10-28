package CondiotionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        boolean isError = false;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (typeOfFruit.equals("banana")) {
                    price = 2.50;
                } else if (typeOfFruit.equals("apple")) {
                    price = 1.20;
                } else if (typeOfFruit.equals("orange")) {
                    price = 0.85;
                } else if (typeOfFruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (typeOfFruit.equals("kiwi")) {
                    price = 2.70;
                } else if (typeOfFruit.equals("pineapple")) {
                    price = 5.50;
                } else if (typeOfFruit.equals("grapes")) {
                    price = 3.85;
                } else {
                    isError = true;
                    System.out.println("error");
                    break;
                }
                break;
            case "Saturday":
            case "Sunday":
                if (typeOfFruit.equals("banana")) {
                    price = 2.70;
                } else if (typeOfFruit.equals("apple")) {
                    price = 1.25;
                } else if (typeOfFruit.equals("orange")) {
                    price = 0.90;
                } else if (typeOfFruit.equals("grapefruit")) {
                    price = 1.60;
                } else if (typeOfFruit.equals("kiwi")) {
                    price = 3.00;
                } else if (typeOfFruit.equals("pineapple")) {
                    price = 5.60;
                } else if (typeOfFruit.equals("grapes")) {
                    price = 4.20;
                } else {
                    isError = true;
                    System.out.println("error");
                }
                break;
            default:
                isError = true;
                System.out.println("error");
                break;
        }
        totalPrice = price * quantity;
        if (!isError) {
            System.out.printf("%.2f", totalPrice);
        }


    }
}
