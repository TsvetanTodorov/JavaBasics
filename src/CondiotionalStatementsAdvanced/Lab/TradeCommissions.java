package CondiotionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean isValid = false;

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.08;
                } else if (sales > 10000) {
                    commission = sales * 0.12;
                } else {
                    isValid = true;
                    System.out.println("error");
                    break;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.10;
                } else if (sales > 10000) {
                    commission = sales * 0.13;
                } else {
                    isValid = true;
                    System.out.println("error");
                    break;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.12;
                } else if (sales > 10000) {
                    commission = sales * 0.145;
                } else {
                    isValid = true;
                    System.out.println("error");
                    break;
                }
                break;
            default:
                isValid = true;
                System.out.println("error");
                break;
        }
        if (!isValid) {
            System.out.printf("%.2f", commission);
        }
    }

}
