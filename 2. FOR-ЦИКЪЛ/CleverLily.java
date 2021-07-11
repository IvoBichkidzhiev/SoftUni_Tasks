import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int savings = 0;
        int interest = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                interest += 10;
                savings += interest;
                //brat i si vzima po 1 lv tarikatcheto
                savings -= 1;
            } else {
                savings += pricePerToy;
            }
        }
        if (savings >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", savings - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - savings);
        }
    }
}