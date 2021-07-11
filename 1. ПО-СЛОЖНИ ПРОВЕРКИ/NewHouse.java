import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kindOfFlowers = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double pricePerFlower = 0.00;

        if (kindOfFlowers.equals("Roses")) {
            pricePerFlower = 5.00;
            if (numOfFlowers > 80) {
                pricePerFlower = pricePerFlower * (1 - 0.10);
            }
        } else if (kindOfFlowers.equals("Dahlias")) {
            pricePerFlower = 3.80;
            if (numOfFlowers > 90) {
                pricePerFlower = pricePerFlower * (1 - 0.15);
            }
        } else if (kindOfFlowers.equals("Tulips")) {
            pricePerFlower = 2.80;
            if (numOfFlowers > 80) {
                pricePerFlower = pricePerFlower * (1 - 0.15);
            }
        } else if (kindOfFlowers.equals("Narcissus")) {
            pricePerFlower = 3.00;
            if (numOfFlowers < 120) {
                pricePerFlower = pricePerFlower * (1 + 0.15);
            }
        } else if (kindOfFlowers.equals("Gladiolus")) {
            pricePerFlower = 2.50;
            if (numOfFlowers < 80) {
                pricePerFlower = pricePerFlower * (1 + 0.20);
            }
        }
        double sum = pricePerFlower * numOfFlowers;

        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numOfFlowers, kindOfFlowers, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}
