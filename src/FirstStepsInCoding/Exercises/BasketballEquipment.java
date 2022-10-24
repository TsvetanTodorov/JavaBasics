package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int taxForTrainings = Integer.parseInt(scanner.nextLine());

        double basketballShoes = taxForTrainings - (taxForTrainings * 40 / 100);
        double basketballJersey = basketballShoes - (basketballShoes * 20 / 100);
        double ball = basketballJersey - (basketballJersey * 75 / 100);
        double basketballAccessories = ball - (ball * 80 / 100);
        double totalPrice = basketballShoes + basketballJersey + ball + basketballAccessories + taxForTrainings;

        System.out.println(totalPrice);
    }
}
