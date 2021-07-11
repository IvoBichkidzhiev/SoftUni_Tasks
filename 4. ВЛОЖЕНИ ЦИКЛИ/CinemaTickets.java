import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int studentCounter = 0;
        int standartCounter = 0;
        int kidCounter = 0;
        int allTicketsCounter = 0;
        int soldTicketsForThatMovie = 0;

        while (!movie.equalsIgnoreCase("finish")) {

            int svobodniMesta = Integer.parseInt(scanner.nextLine());
            String vidBilet = scanner.nextLine();

            while (!vidBilet.equalsIgnoreCase("end")) {

                if (vidBilet.equalsIgnoreCase("student")) {
                    studentCounter++;
                } else if (vidBilet.equalsIgnoreCase("standard")) {
                    standartCounter++;
                } else if (vidBilet.equalsIgnoreCase("kid")) {
                    kidCounter++;
                }
                allTicketsCounter++;
                soldTicketsForThatMovie++;

                if (soldTicketsForThatMovie == svobodniMesta) {
                    break;
                }
                vidBilet = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full. %n", movie, soldTicketsForThatMovie * 100.0 / svobodniMesta);

            soldTicketsForThatMovie = 0;
            movie = scanner.nextLine();

        }
        if (movie.equalsIgnoreCase("finish")) {
            System.out.printf("Total tickets: %d %n", allTicketsCounter);
            System.out.printf("%.2f%% student tickets. %n", studentCounter * 100.0 / allTicketsCounter);
            System.out.printf("%.2f%% standard tickets. %n", standartCounter * 100.0 / allTicketsCounter);
            System.out.printf("%.2f%% kids tickets. %n", kidCounter * 100.0 / allTicketsCounter);
        }
    }
}
