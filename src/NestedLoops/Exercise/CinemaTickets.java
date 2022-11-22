package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!movieName.equals("Finish")) {
            int emptySeats = Integer.parseInt(scanner.nextLine());
            int totalTickets = 0;

            while (totalTickets <= emptySeats) {
                String typeOfTicket = scanner.nextLine();

                switch (typeOfTicket) {
                    case "student":
                        totalTickets++;
                        studentTickets++;
                        break;
                    case "standard":
                        totalTickets++;
                        standardTickets++;
                        break;
                    case "kid":
                        totalTickets++;
                        kidTickets++;
                        break;
                }

                if (totalTickets >= emptySeats || typeOfTicket.equals("End")) {
                    double percentageFull = ((double) totalTickets / emptySeats) * 100;
                    System.out.printf("%s - %.2f%% full.%n", movieName, percentageFull);
                    break;
                }
            }
            movieName = scanner.nextLine();
        }

        int allTickets = studentTickets + standardTickets + kidTickets;

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", (((double) studentTickets / allTickets) * 100));
        System.out.printf("%.2f%% standard tickets.%n", (((double) standardTickets / allTickets) * 100));
        System.out.printf("%.2f%% kids tickets.%n", (((double) kidTickets / allTickets) * 100));


    }
}
