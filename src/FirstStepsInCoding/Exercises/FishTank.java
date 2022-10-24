package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int aquariumCapacity = length * width * height;
        double capacityInLiters = aquariumCapacity * 0.001;
        double takenCapacity = percentage / 100;
        double neededLiters = capacityInLiters * (1 - takenCapacity);

        System.out.println(neededLiters);
    }
}
