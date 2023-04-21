package JavaBasicExam;

import java.util.Scanner;

public class _01_FruitMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice * 0.5;
        double orangePrice = raspberryPrice * 0.6;
        double bananaPrice = raspberryPrice * 0.2;

        double totalCost = (strawberryPrice * strawberryKg) + (raspberryPrice * raspberryKg) + (orangePrice * orangeKg)
                + (bananaPrice * bananaKg);

        System.out.printf("%.2f", totalCost);

    }
}
