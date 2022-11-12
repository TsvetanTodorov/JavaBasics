package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juryQuantity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int gradesCounter = 0;
        double totalGrades = 0;

        while (!input.equals("Finish")) {
            String presentationName = input;
            double sumCurrentPresentationGrades = 0;
            for (int i = 1; i <= juryQuantity; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesCounter++;
                sumCurrentPresentationGrades += grade;
            }

            totalGrades += sumCurrentPresentationGrades;
            System.out.printf("%s - %.2f.%n", presentationName, sumCurrentPresentationGrades / juryQuantity);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrades / gradesCounter);
    }
}
