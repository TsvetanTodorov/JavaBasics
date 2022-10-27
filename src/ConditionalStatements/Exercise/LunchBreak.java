package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double lunch = lunchBreak * 0.125;
        double relaxTime = lunchBreak * 0.25;

        double totalTime = episode + lunch + relaxTime;
        double timeLeft = Math.abs(lunchBreak - totalTime);

        if(lunchBreak >= totalTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movieName,
                    Math.ceil(timeLeft));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName,
                    Math.ceil(timeLeft));
        }
    }
}
