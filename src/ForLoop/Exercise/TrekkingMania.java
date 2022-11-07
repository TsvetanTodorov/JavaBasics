package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupsQuantity = Integer.parseInt(scanner.nextLine());

        int mussalaGroup = 0;
        int montblancGroup = 0;
        int kilimandjaroGroup = 0;
        int k2Group = 0;
        int everestGroup = 0;
        int totalPeople = 0;


        for (int i = 1; i <= groupsQuantity; i++) {
            int currentGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += currentGroup;
            if (isLessOrEqualsFive(currentGroup)) {
                mussalaGroup += currentGroup;
            } else if (isLessOrEqualsTwelve(currentGroup)) {
                montblancGroup += currentGroup;
            } else if (isLessOrEqualsTwentyFive(currentGroup)) {
                kilimandjaroGroup += currentGroup;
            } else if (isLessOrEqualsForty(currentGroup)) {
                k2Group += currentGroup;
            } else {
                everestGroup += currentGroup;
            }

        }


        printClimbingInPercent(mussalaGroup, totalPeople);
        printClimbingInPercent(montblancGroup, totalPeople);
        printClimbingInPercent(kilimandjaroGroup, totalPeople);
        printClimbingInPercent(k2Group, totalPeople);
        printClimbingInPercent(everestGroup, totalPeople);
    }


    private static boolean isLessOrEqualsFive(int num) {
        return num <= 5;
    }

    private static boolean isLessOrEqualsTwelve(int num) {
        return num <= 12;
    }

    private static boolean isLessOrEqualsTwentyFive(int num) {
        return num <= 25;
    }

    private static boolean isLessOrEqualsForty(int num) {
        return num <= 40;
    }

    private static void printClimbingInPercent(int num1, int num2){
        System.out.printf("%.2f%%%n", ((num1 * 1.00) / num2) * 100);
    }
}
