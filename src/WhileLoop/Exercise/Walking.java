package WhileLoop.Exercise;


import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stepsTarget = 10000;
        int totalSteps = 0;


        while (totalSteps <= stepsTarget) {
            String command = scanner.nextLine();
            if (command.equals("Going home")) {
                int goingHomeSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += goingHomeSteps;
                break;
            }
            int currentSteps = Integer.parseInt(command);
            totalSteps += currentSteps;

        }

        if (isMoreOrEquals(totalSteps, stepsTarget)) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(totalSteps - stepsTarget));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(stepsTarget - totalSteps));
        }

    }

    private static boolean isMoreOrEquals(int num1, int num2) {
        return num1 >= num2;
    }
}
