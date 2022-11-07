package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournamentsQuantity = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int wonGamesCounter = 0;
        for (int i = 1; i <= tournamentsQuantity; i++) {
            String type = scanner.nextLine();

            switch (type) {
                case "W":
                    points += 2000;
                    wonGamesCounter++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }

        double percentWin = wonGamesCounter * 1.00 / tournamentsQuantity * 100;

        System.out.printf("Final points: %d%n", points + startingPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(points * 1.00 / tournamentsQuantity));
        System.out.printf("%.2f%%", percentWin);
    }
}
