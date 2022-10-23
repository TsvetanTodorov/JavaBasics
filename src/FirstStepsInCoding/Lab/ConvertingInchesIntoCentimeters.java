package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConvertingInchesIntoCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double result = num * 2.54;

        System.out.println(result);
    }

}
