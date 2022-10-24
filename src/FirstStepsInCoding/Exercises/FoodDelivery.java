package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenuQuantity = Integer.parseInt(scanner.nextLine());
        int fishMenuQuantity = Integer.parseInt(scanner.nextLine());
        int veganMenuQuantity = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double veganMenuPrice = 8.15;
        double deliveryPrice = 2.50;

        double chickenMenuTotalPrice = chickenMenuQuantity * chickenMenuPrice;
        double fishMenuTotalPrice = fishMenuQuantity * fishMenuPrice;
        double veganMenuTotalPrice = veganMenuQuantity * veganMenuPrice;
        double totalMenuPrice = chickenMenuTotalPrice + fishMenuTotalPrice + veganMenuTotalPrice;
        double dessertPrice = totalMenuPrice * 0.20;
        double totalPrice = totalMenuPrice + dessertPrice + deliveryPrice;

        System.out.println(totalPrice);
    }
}
