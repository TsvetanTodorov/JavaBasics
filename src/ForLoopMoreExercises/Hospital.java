package ForLoopMoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalDays = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int seenPatients = 0;
        int unSeenPatients = 0;

        for (int day = 1; day <= totalDays; day++) {

            if (isItThirdAndIsMoreThan(day, unSeenPatients, seenPatients)) {
                doctors++;
            }
            int patientsForTheCurrentDay = Integer.parseInt(scanner.nextLine());
            if (isMoreThan(patientsForTheCurrentDay, doctors)) {
                unSeenPatients = unSeenPatients + (patientsForTheCurrentDay - doctors);
                seenPatients += doctors;
            } else {
                seenPatients = seenPatients + patientsForTheCurrentDay;
            }
        }
        System.out.printf("Treated patients: %d.%n", seenPatients);
        System.out.printf("Untreated patients: %d.", unSeenPatients);

    }

    private static boolean isItThirdAndIsMoreThan(int day, int num1, int num2) {
        return day % 3 == 0 && num1 > num2;
    }

    private static boolean isMoreThan(int num1, int num2) {
        return num1 > num2;
    }
}
