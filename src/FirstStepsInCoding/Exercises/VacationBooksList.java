package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pagesInCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesRedFor1Hour = Integer.parseInt(scanner.nextLine());
        int daysQuantity = Integer.parseInt(scanner.nextLine());

        int totalTimeForReading = pagesInCurrentBook / pagesRedFor1Hour;
        int hoursPerDayForReading = totalTimeForReading / daysQuantity;

        System.out.println(hoursPerDayForReading);

    }
}

