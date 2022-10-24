package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pricePerPackOfPens = 5.80;
        double pricePerPackOfMarkers = 7.20;
        double cleaningSprayPrice = 1.20;

        int packsOfPensQuantity = Integer.parseInt(scanner.nextLine());
        int packsOfMarkersQuantity = Integer.parseInt(scanner.nextLine());
        int cleaningSprayQuantity = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double totalPriceForPens = pricePerPackOfPens * packsOfPensQuantity;
        double totalPriceForMarkers = pricePerPackOfMarkers * packsOfMarkersQuantity;
        double totalPriceForCleaningSpray = cleaningSprayPrice * cleaningSprayQuantity;
        double priceForAllMaterials = totalPriceForPens + totalPriceForMarkers + totalPriceForCleaningSpray;

        double totalPriceAfterTheDiscount = priceForAllMaterials - (priceForAllMaterials * percentDiscount / 100);

        System.out.println(totalPriceAfterTheDiscount);
    }
}
