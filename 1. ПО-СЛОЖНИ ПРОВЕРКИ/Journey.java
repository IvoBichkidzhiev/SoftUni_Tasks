import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double expenses = 0.00;

        if (budget <= 100) { // Bulgaria
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")) {
                expenses = budget * 0.30;
            } else if (season.equals("winter")) {
                expenses = budget * 0.70;
            }
        } else if (budget <= 1000) { // Balkans
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")) {
                expenses = budget * 0.40;
            } else if (season.equals("winter")) {
                expenses = budget * 0.80;
            }
        } else if (budget > 1000) { // Europe
            System.out.println("Somewhere in Europe");
            expenses = budget * 0.90;
        }
        if (budget > 1000) {
            System.out.printf("Hotel - %.2f", expenses);
        } else if (season.equals("summer")){
            System.out.printf("Camp - %.2f", expenses);
        } else if  (season.equals("winter")) {
            System.out.printf("Hotel - %.2f", expenses);
        }


    }
}
