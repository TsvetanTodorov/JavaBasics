package ConditionalStatements.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfFiguresAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = calculateArea(scanner);

        System.out.println(formatToThirdDecimal(area));
    }

    private static double calculateSquare(Scanner scanner) {
        double side = Double.parseDouble(scanner.nextLine());
        return side * side;
    }

    private static double calculateRectangle(Scanner scanner) {
        double firstSide = Double.parseDouble(scanner.nextLine());
        double secondSide = Double.parseDouble(scanner.nextLine());
        return firstSide * secondSide;
    }

    private static double calculateCircle(Scanner scanner) {
        double side = Double.parseDouble(scanner.nextLine());

        return Math.PI * (side * side);
    }

    private static double calculateTriangle(Scanner scanner) {
        double firstSide = Double.parseDouble(scanner.nextLine());
        double secondSide = Double.parseDouble(scanner.nextLine());

        return (firstSide * secondSide) / 2;
    }

    private static boolean isSquare(String typeOfFigure) {
        return typeOfFigure.equals("square");
    }

    private static boolean isRectangle(String typeOfFigure) {
        return typeOfFigure.equals("rectangle");
    }

    private static boolean isCircle(String typeOfFigure) {
        return typeOfFigure.equals("circle");
    }

    private static boolean isTriangle(String typeOfFigure) {
        return typeOfFigure.equals("triangle");
    }

    private static String formatToThirdDecimal(double number) {
        DecimalFormat df = new DecimalFormat("#.000");
        return df.format(number);
    }

    private static double calculateArea(Scanner scanner) {

        String typeOfFigure = scanner.nextLine();
        double area = 0;

        if (isSquare(typeOfFigure)) {
            area = calculateSquare(scanner);
        } else if (isRectangle(typeOfFigure)) {
            area = calculateRectangle(scanner);
        } else if (isCircle(typeOfFigure)) {
            area = calculateCircle(scanner);
        } else if (isTriangle(typeOfFigure)) {
            area = calculateTriangle(scanner);
        }
        return area;
    }

}
