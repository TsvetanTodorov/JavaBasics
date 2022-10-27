package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesQuantity = Integer.parseInt(scanner.nextLine());
        int talkingDollsQuantity = Integer.parseInt(scanner.nextLine());
        int bearsQuantity = Integer.parseInt(scanner.nextLine());
        int minionsQuantity = Integer.parseInt(scanner.nextLine());
        int trucksQuantity = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double talkingDollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double totalPrice = (puzzlesQuantity * puzzlePrice) + (talkingDollPrice * talkingDollsQuantity) +
                (bearsQuantity * bearPrice) + (minionsQuantity * minionPrice) + (trucksQuantity * truckPrice);

        int totalToysQuantity = puzzlesQuantity + talkingDollsQuantity + bearsQuantity + minionsQuantity + trucksQuantity;

        if (totalToysQuantity >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }
        totalPrice = totalPrice - (totalPrice * 0.10);

        if (totalPrice >= vacationPrice) {

            System.out.printf("Yes! %.2f lv left.", totalPrice - vacationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalPrice - vacationPrice));
        }
    }
}
