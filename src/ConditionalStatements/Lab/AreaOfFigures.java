package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();

        double area = 0;

        if (typeOfFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;

        } else if (typeOfFigure.equals("rectangle")) {
            double firstSide = Double.parseDouble(scanner.nextLine());
            double secondSide = Double.parseDouble(scanner.next());
            area = firstSide * secondSide;

        } else if (typeOfFigure.equals("circle")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = Math.PI * (side * side);

        } else if (typeOfFigure.equals("triangle")) {
            double firstSide = Double.parseDouble(scanner.nextLine());
            double secondSide = Double.parseDouble(scanner.nextLine());
            area = (firstSide * secondSide) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
