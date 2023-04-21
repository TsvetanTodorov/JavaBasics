package JavaBasicExam;

import java.util.Scanner;

public class _05_DivisionWithoutRemainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());


        double p1 = 0;
        double p2 = 0;
        double p3 = 0;


        for (int i = 1; i <= numbers; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            if (n % 2 == 0) {
                p1++;
            }

            if (n % 3 == 0) {
                p2++;
            }

            if (n % 4 == 0) {
                p3++;
            }
        }

        double p1percentage = p1 / numbers * 100;
        double p2percentage = p2 / numbers * 100;
        double p3percentage = p3 / numbers * 100;

        System.out.printf("%.2f%%%n", p1percentage);
        System.out.printf("%.2f%%%n", p2percentage);
        System.out.printf("%.2f%%%n", p3percentage);
    }
}
