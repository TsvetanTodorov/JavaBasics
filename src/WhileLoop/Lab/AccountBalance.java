package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        double totalMoney = 0;

        while (!n.equals("NoMoreMoney")) {
            double currentMoney = Double.parseDouble(n);

            if (currentMoney > 0) {
                System.out.printf("Increase: %.2f%n", currentMoney);
                totalMoney += currentMoney;
            } else {
                System.out.printf("Invalid operation!%n");
                break;
            }
            n = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);


    }
}
