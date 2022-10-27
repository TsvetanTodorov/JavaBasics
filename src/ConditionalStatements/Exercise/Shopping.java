package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsQuantity = Integer.parseInt(scanner.nextLine());
        int cpuQuantity = Integer.parseInt(scanner.nextLine());
        int ramMemoryQuantity = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250;
        double videoCardPurchased = videoCardPrice * videoCardsQuantity;

        double cpuPrice = videoCardPurchased * 0.35;
        double cpuPurchased = cpuPrice * cpuQuantity;

        double ramMemoryPrice = videoCardPurchased * 0.10;
        double ramMemoryPurchased = ramMemoryPrice * ramMemoryQuantity;

        double totalPrice = videoCardPurchased + cpuPurchased + ramMemoryPurchased;

        if(videoCardsQuantity > cpuQuantity){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        if(budget >= totalPrice){
            System.out.printf("You have %.2f leva left!" , Math.abs(budget - totalPrice));
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!" , Math.abs(totalPrice - budget));
        }

    }
}
