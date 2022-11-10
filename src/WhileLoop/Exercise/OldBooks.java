package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        int counter = 0;
        boolean isFound = false;

        while (!input.equals("No More Books")) {
            if (input.equals(bookName)) {
                isFound = true;
                break;
            }
            counter++;
            input = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
        }
    }
}
