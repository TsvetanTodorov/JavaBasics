package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while (sum < budget) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Going to " + input + "!");

            input = scanner.nextLine();
        }

    }
}
