package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;
        double ticketPrice = 0;

        switch (typeOfProjection) {
            case "Premiere":
                ticketPrice = 12;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }
        totalProfit = ticketPrice * rows * columns;

        System.out.printf("%.2f leva", totalProfit);
    }
}
