package JavaBasicExam;

import java.util.Scanner;

public class _02_Safari {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double totalCost = (litersFuel * 2.10) + 100;

        switch (day) {
            case "Saturday":
                totalCost *= 0.9;
                break;
            case "Sunday":
                totalCost *= 0.8;
                break;
        }

        if (totalCost <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.\n", budget - totalCost);
        }else{
            System.out.printf("Not enough money! Money needed: %.2f lv.\n", totalCost - budget);
        }


    }
}
