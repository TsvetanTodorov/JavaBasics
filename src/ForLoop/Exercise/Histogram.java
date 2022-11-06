package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (isLessThanTwoHundred(currentNumber)) {
                p1++;
            } else if (isLessThanFourHundred(currentNumber)) {
                p2++;
            } else if (isLessThanSixHundred(currentNumber)) {
                p3++;
            } else if (isLessThanEightHundred(currentNumber)) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%", (p1 * 1.00) / n * 100);
        System.out.println();
        System.out.printf("%.2f%%", (p2 * 1.00) / n * 100);
        System.out.println();
        System.out.printf("%.2f%%", (p3 * 1.00) / n * 100);
        System.out.println();
        System.out.printf("%.2f%%", (p4 * 1.00) / n * 100);
        System.out.println();
        System.out.printf("%.2f%%", (p5 * 1.00) / n * 100);
    }


    private static boolean isLessThanTwoHundred(int num) {
        return num < 200;
    }

    private static boolean isLessThanFourHundred(int num) {
        return num < 400;
    }

    private static boolean isLessThanSixHundred(int num) {
        return num < 600;
    }

    private static boolean isLessThanEightHundred(int num) {
        return num < 800;
    }

}
