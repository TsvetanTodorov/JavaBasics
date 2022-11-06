package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double moneyForBirthday = 0;
        int toyCounter = 0;
        int brotherCounter = 0;

        for (int i = 1; i <= age; i++) {
            if (isEven(i)) {
                moneyForBirthday += 10.00 * i / 2;
                brotherCounter++;
            } else {
                toyCounter++;
            }
        }
        double totalToysPrice = toyCounter * toyPrice;

        double totalMoney = totalToysPrice + moneyForBirthday - brotherCounter;

        if (isLessOrEquals(washingMachinePrice, totalMoney)) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - totalMoney);
        }

    }


    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static boolean isLessOrEquals(double price1, double price2) {
        return price1 <= price2;
    }

}


