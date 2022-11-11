package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());

        int totalCakePieces = cakeLength * cakeWidth;

        while (totalCakePieces >= 0) {
            String command = scanner.nextLine();
            if (command.equals("STOP")) {
                System.out.printf("%d pieces are left.", totalCakePieces);
                return;

            }
            int currentPiece = Integer.parseInt(command);
            totalCakePieces -= currentPiece;
            if (totalCakePieces < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalCakePieces));
                break;
            }
        }


    }
}
