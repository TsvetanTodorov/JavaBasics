package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dogsFoodPrice = 2.50;
        int catsFoodPrice = 4;

        double dogsFoodQuantity = Double.parseDouble(scan.nextLine());
        double catsFoodQuantity = Double.parseDouble(scan.nextLine());

        double totalDogsFood = dogsFoodPrice * dogsFoodQuantity;
        double totalCatsFood = catsFoodPrice * catsFoodQuantity;

        double totalPrice = totalCatsFood + totalDogsFood;

        System.out.println(totalPrice + " lv.");


    }
}
