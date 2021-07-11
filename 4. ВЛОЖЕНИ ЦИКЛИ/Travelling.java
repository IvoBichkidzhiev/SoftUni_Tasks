import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();


        while (!destination.equalsIgnoreCase("end")) {

            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savings = 0.00;

            while (savings < neededMoney) {

                double addToSavings = Double.parseDouble(scanner.nextLine());
                savings += addToSavings;

                if (savings >= neededMoney) {
                    System.out.printf("Going to %s! %n", destination);
                    break;
                }
            }
            destination = scanner.nextLine();

        }

    }
}
