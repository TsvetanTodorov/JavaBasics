package Exam;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sweetType = scanner.nextLine();
        int sweetsQuantity = Integer.parseInt(scanner.nextLine());
        int date = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;

        switch (sweetType) {
            case "Cake":
                if (date <= 15) {
                    price = 24;
                } else {
                    price = 28.70;
                }
                break;
            case "Souffle":
                if (date <= 15) {
                    price = 6.66;
                } else {
                    price = 9.80;
                }
                break;
            case "Baklava":
                if (date <= 15) {
                    price = 12.60;
                } else {
                    price = 16.98;
                }
                break;
            default:
                break;

        }

        totalPrice = price * sweetsQuantity;
        if (date <= 22) {
            if (totalPrice >= 100 && totalPrice <= 200) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            } else if (totalPrice >= 200) {
                totalPrice = totalPrice - (totalPrice * 0.25);
            }

            if (date <= 15) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            }
        }


        System.out.printf("%.2f", totalPrice);
    }
}
