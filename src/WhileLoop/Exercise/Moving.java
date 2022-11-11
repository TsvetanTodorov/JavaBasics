package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalCubicMeters = width * length * height;

        while (totalCubicMeters > 0) {
            String command = scanner.nextLine();
            if (command.equals("Done")) {
                System.out.printf("%d Cubic meters left.", totalCubicMeters);
                return;
            }
            int currentCubicMeters = Integer.parseInt(command);
            totalCubicMeters -= currentCubicMeters;

            if (totalCubicMeters <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalCubicMeters));
            }
        }
    }
}
