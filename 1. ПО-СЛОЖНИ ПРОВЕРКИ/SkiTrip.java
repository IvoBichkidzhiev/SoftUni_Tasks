import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String opinion = scanner.nextLine();
        int nights = days - 1;
        double pricePerNightWithDiscount = 0.00;


        if (room.equals("room for one person")) {
                pricePerNightWithDiscount = 18.00;

        } else if (room.equals("apartment")) {
            if (nights < 10) {
                pricePerNightWithDiscount = 25.00 * 0.7;
            } else if (nights <= 15) {
                pricePerNightWithDiscount = 25.00 * 0.65;
            } else if (nights > 15) {
                pricePerNightWithDiscount = 25.00 * 0.5;
            }
        } else if (room.equals("president apartment")) {
            if (nights < 10) {
                pricePerNightWithDiscount = 35.00 * 0.9;
            } else if (nights <= 15) {
                pricePerNightWithDiscount = 35.00 * (1 - 0.15);
            } else if (nights > 15) {
                pricePerNightWithDiscount = 35.00 * (1 - 0.20);
            }
        }

        double priceForAllNights = pricePerNightWithDiscount * nights;

        if (opinion.equals("positive")) {
            priceForAllNights = priceForAllNights * 1.25;
            System.out.printf("%.2f", priceForAllNights);
        } else if (opinion.equals("negative")){
            priceForAllNights = priceForAllNights * 0.90;
            System.out.printf("%.2f", priceForAllNights);
        }
    }
}
