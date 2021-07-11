import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.00;

        while (!input.equals("NoMoreMoney")) {
            double addMoney = Double.parseDouble(input);

            if (addMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", addMoney);
            sum += addMoney;
            input = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", sum);
    }
}
