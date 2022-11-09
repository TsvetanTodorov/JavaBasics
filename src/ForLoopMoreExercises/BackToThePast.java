package ForLoopMoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearHeHasToLiveTo = Integer.parseInt(scanner.nextLine());

        int yearsOld = 18;
        for (int i = 1800; i <= yearHeHasToLiveTo; i++) {
            if (isEven(i)) {
                inheritedMoney -= 12000;
            } else {
                inheritedMoney -= 12000 + (50 * yearsOld);
            }
            yearsOld++;

        }

        if (isMoreOrEqualsZero(inheritedMoney)) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(0 - inheritedMoney));
        }
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static boolean isMoreOrEqualsZero(double num) {
        return num >= 0;
    }
}
