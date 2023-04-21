package JavaBasicExam;

import java.util.Scanner;

public class _03_MobileOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contractPeriod = scanner.nextLine();
        String contractType = scanner.nextLine();
        String isInternet = scanner.nextLine();
        int monthPeriod = Integer.parseInt(scanner.nextLine());

        double monthPrice = 0;
        switch (contractPeriod) {
            case "one":
                if (contractType.equals("Small")) {
                    monthPrice = 9.98;
                } else if (contractType.equals("Middle")) {
                    monthPrice = 18.99;
                } else if (contractType.equals("Large")) {
                    monthPrice = 25.98;
                } else if (contractType.equals("ExtraLarge")) {
                    monthPrice = 35.99;
                }
                break;
            case "two":
                if (contractType.equals("Small")) {
                    monthPrice = 8.58;
                } else if (contractType.equals("Middle")) {
                    monthPrice = 17.09;
                } else if (contractType.equals("Large")) {
                    monthPrice = 23.59;
                } else if (contractType.equals("ExtraLarge")) {
                    monthPrice = 31.79;
                }
                break;
        }

        if (isInternet.equals("yes")) {
            if (monthPrice <= 10) {
                monthPrice += 5.50;
            } else if (monthPrice <= 30) {
                monthPrice += 4.35;
            } else {
                monthPrice += 3.85;
            }
        }

        double totalSum = monthPrice * monthPeriod;

        if (contractPeriod.equals("two")) {
            totalSum = totalSum - (totalSum * 0.0375);
        }

        System.out.printf("%.02f lv.", totalSum);
    }
}
