package Exam;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int transitionPrice = Integer.parseInt(scanner.nextLine());
        double consumeElectricityPerVideoCard = Double.parseDouble(scanner.nextLine());
        double profitFromVideoCardPerDay = Double.parseDouble(scanner.nextLine());

        int videoCardQuantity = 13;
        int transitionsQuantity = 13;
        int componentsPrice = 1000;

        int videoCardsTotalPrice = videoCardPrice * videoCardQuantity;
        int transitionTotalPrice = transitionPrice * transitionsQuantity;
        int totalSpendMoney = videoCardsTotalPrice + transitionTotalPrice + componentsPrice;

        double earningsFromCardPerDay = profitFromVideoCardPerDay - consumeElectricityPerVideoCard;
        double profitPerDayFromVideoCards = videoCardQuantity * earningsFromCardPerDay;
        double daysToGetMoneyBack = totalSpendMoney / profitPerDayFromVideoCards;

        System.out.println(totalSpendMoney);
        System.out.printf("%.00f", Math.ceil(daysToGetMoneyBack));

    }
}
