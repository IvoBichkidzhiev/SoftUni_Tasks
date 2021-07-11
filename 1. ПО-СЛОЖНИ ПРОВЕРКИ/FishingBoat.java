import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numOfFishers = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        if (season.equals("Summer") || season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Winter")) {
            price = 2600;
        } else {
            System.out.println("Nevaliden sezon.");
        }
        if (numOfFishers > 0 && numOfFishers <= 6) {
            price = price * (1 - 0.1);
        } else if (numOfFishers > 0 && numOfFishers <= 11) {
            price = price * (1 - 0.15);
        } else if (numOfFishers > 12) {
            price = price * (1 - 0.25);
        }

        if (numOfFishers % 2 == 0) {
            if (season.equals("Autumn")) {
                price = price;
            } else {
                price = price * (1 - 0.05);
            }
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
    }
}
