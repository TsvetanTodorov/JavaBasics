package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double protectiveNylonPrice = 1.50;
        double paintPrice = 14.50;
        double paintThinnerPrice = 5;

        int neededProtectiveNylonQuantity = Integer.parseInt(scanner.nextLine());
        int neededPaintQuantity = Integer.parseInt(scanner.nextLine());
        int neededPaintThinnerQuantity = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double costsForProtectiveNylon = (neededProtectiveNylonQuantity + 2) * protectiveNylonPrice;
        double costsForPaint = (neededPaintQuantity + neededPaintQuantity * 10 / 100.00) * paintPrice;
        double costsForPaintThinner = neededPaintThinnerQuantity * paintThinnerPrice;
        double bagPrice = 0.40;
        double totalCostsForMaterials = costsForProtectiveNylon + costsForPaint + costsForPaintThinner + bagPrice;
        double costsForWorkers = (totalCostsForMaterials * 0.30) * workingHours;
        double totalCosts = totalCostsForMaterials + costsForWorkers;

        System.out.println(totalCosts);

    }
}
