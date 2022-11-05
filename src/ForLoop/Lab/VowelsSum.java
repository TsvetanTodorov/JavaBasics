package ForLoop.Lab;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int points = 0;
        int totalPoints = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char symbol = text.charAt(i);
            if (symbol == 'a') {
                points = 1;
                totalPoints += points;
            } else if (symbol == 'e') {
                points = 2;
                totalPoints += points;
            } else if (symbol == 'i') {
                points = 3;
                totalPoints += points;
            } else if (symbol == 'o') {
                points = 4;
                totalPoints += points;
            } else if (symbol == 'u') {
                points = 5;
                totalPoints += points;

            }
        }
        System.out.println(totalPoints);
    }
}
