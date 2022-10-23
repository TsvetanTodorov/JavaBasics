package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectsQuantity = Integer.parseInt(scan.nextLine());
        int neededHours = projectsQuantity * 3;

        System.out.println("The architect " + name + " will need " + neededHours + " hours to complete "
        + projectsQuantity + " project/s.");
    }
}
