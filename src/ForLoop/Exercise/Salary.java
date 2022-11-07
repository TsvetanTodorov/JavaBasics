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
            if (currentOpenTab.equals("Facebook")) {
                salary -= 150;
            } else if (currentOpenTab.equals("Instagram")) {
                salary -= 100;
            } else if (currentOpenTab.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                isValid = true;
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if(!isValid){
            System.out.println(salary);
        }
    }


}
