package JavaBasicExam;

import java.util.Scanner;

public class _04_TouristShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int productsCounter = 0;
        double totalProductPrice = 0;
        String productName = scanner.nextLine();

        while (!productName.equals("Stop")) {

            double productPrice = Double.parseDouble(scanner.nextLine());
            productsCounter++;

            if (productsCounter % 3 == 0) {
                productPrice = productPrice * 0.5;
            }

            totalProductPrice += productPrice;
            if (totalProductPrice > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.02f leva!\n", Math.abs(totalProductPrice - budget));
                break;
            }

            productName = scanner.nextLine();
        }

        if (productName.equals("Stop")) {
            System.out.printf("You bought %d products for %.02f leva.\n", productsCounter, totalProductPrice);
        }
    }
}
