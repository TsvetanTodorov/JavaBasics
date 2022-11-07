package ForLoop.Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;

        for (int i = 1; i <= openTabs; i++) {
            String currentOpenTab = scanner.nextLine();
            if (isEqualsFacebook(currentOpenTab)) {
                salary -= 150;
            } else if (isEqualsInstagram(currentOpenTab)) {
                salary -= 100;
            } else if (isEqualsReddit(currentOpenTab)) {
                salary -= 50;
            }

            if (salary <= 0) {
                isValid = true;
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (!isValid) {
            System.out.println(salary);
        }
    }


    private static boolean isEqualsFacebook(String text) {
        return text.equals("Facebook");
    }

    private static boolean isEqualsInstagram(String text) {
        return text.equals("Instagram");
    }

    private static boolean isEqualsReddit(String text) {
        return text.equals("Reddit");
    }
}
