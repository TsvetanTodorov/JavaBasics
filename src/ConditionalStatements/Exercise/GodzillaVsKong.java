package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double suitPricePerWorker = Double.parseDouble(scanner.nextLine());

        double decor = budget - (budget * 0.90);

        double suitsPrice = workers * suitPricePerWorker;

        if (workers > 150) {
            suitsPrice = suitsPrice * 0.90;
        }

        double totalMoviePrice = decor + suitsPrice;

        if (totalMoviePrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalMoviePrice - budget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(totalMoviePrice - budget));
        }
    }
}
