package Exam;

import java.util.Scanner;

public class AndProcessors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cpuTarget = Integer.parseInt(scanner.nextLine());
        int workersQuantity = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());
        double pricePerCpu = 110.10;

        int workingHoursPerDay = 8;

        int totalWorkingHours = workersQuantity * workingDays * workingHoursPerDay;
        int madeCpus = (int) Math.floor(totalWorkingHours / 3);

        if (madeCpus >= cpuTarget) {
            int leftCpus = madeCpus - cpuTarget;
            double totalProfit = leftCpus * pricePerCpu;
            System.out.printf("Profit: -> %.2f BGN", totalProfit);
        } else {
            int cpuDiff = Math.abs(cpuTarget - madeCpus);
            double lostMoney = cpuDiff * pricePerCpu;
            System.out.printf("Losses: -> %.2f BGN", lostMoney);
        }

    }
}
