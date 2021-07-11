import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.00;
        double apartmentPrice = 0.00;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.00;
            apartmentPrice = 65.00;
            if (nights > 7 && nights <= 14) {
                studioPrice = studioPrice * (1 - 0.05);
            } else if (nights > 14) {
                studioPrice = studioPrice * (1 - 0.30);
                apartmentPrice = apartmentPrice * (1 - 0.10);
            }

        }
        if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (nights > 14) {
                studioPrice = studioPrice * (1 - 0.20);
                apartmentPrice = apartmentPrice * (1 - 0.10);
            }
        }
        if (month.equals("July") || month.equals("August")) {
            studioPrice = 76.00;
            apartmentPrice = 77.00;
            if (nights > 14) {
                apartmentPrice = apartmentPrice * (1 - 0.10);
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice * nights);
        System.out.printf("Studio: %.2f lv.", studioPrice * nights);
    }
}
