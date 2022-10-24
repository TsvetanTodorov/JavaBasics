package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yardsWhoMustBeGreened = Integer.parseInt(scanner.nextLine());

        double pricePerYard = 7.61;
        double discount = 0.18;
        double finalPrice = yardsWhoMustBeGreened * pricePerYard;
        double finalDiscount = discount * finalPrice;
        double finalPriceAfterDiscount = finalPrice - finalDiscount;

        System.out.println("The final price is: " + finalPriceAfterDiscount + " lv.");
        System.out.println("The discount is: " + finalDiscount + " lv.");

    }
}