import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsOutSideOfSofia = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - weekendsOutSideOfSofia;

        double summAllPlays = (weekendsInSofia * 3.0/ 4) + weekendsOutSideOfSofia + (holidays * 2.0 / 3);

        if (typeOfYear.equals("leap")) {
            summAllPlays *= (1 + 0.15);
        } else if (typeOfYear.equals("normal")) {
            summAllPlays = summAllPlays;
        }
        System.out.printf("%.0f", Math.floor(summAllPlays));
    }
}