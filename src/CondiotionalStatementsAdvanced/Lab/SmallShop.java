package CondiotionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double productQuantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    totalPrice = productQuantity * 0.50;
                } else if (product.equals("water")) {
                    totalPrice = productQuantity * 0.80;
                } else if (product.equals("beer")) {
                    totalPrice = productQuantity * 1.20;
                } else if (product.equals("sweets")) {
                    totalPrice = productQuantity * 1.45;
                } else if (product.equals("peanuts")) {
                    totalPrice = productQuantity * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    totalPrice = productQuantity * 0.40;
                } else if (product.equals("water")) {
                    totalPrice = productQuantity * 0.70;
                } else if (product.equals("beer")) {
                    totalPrice = productQuantity * 1.15;
                } else if (product.equals("sweets")) {
                    totalPrice = productQuantity * 1.30;
                } else if (product.equals("peanuts")) {
                    totalPrice = productQuantity * 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    totalPrice = productQuantity * 0.45;
                } else if (product.equals("water")) {
                    totalPrice = productQuantity * 0.70;
                } else if (product.equals("beer")) {
                    totalPrice = productQuantity * 1.10;
                } else if (product.equals("sweets")) {
                    totalPrice = productQuantity * 1.35;
                } else if (product.equals("peanuts")) {
                    totalPrice = productQuantity * 1.55;
                }
                break;
        }
        System.out.println(totalPrice);
    }
}
