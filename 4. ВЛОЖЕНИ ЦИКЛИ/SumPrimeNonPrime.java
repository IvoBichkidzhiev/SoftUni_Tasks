import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int prostiChislaSum = 0;
        int neProstiChislaSum = 0;

        while (!input.equalsIgnoreCase("stop")) {

            int inputToNumber = Integer.parseInt(input);

            boolean prostoChislo = true;

            if (inputToNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < inputToNumber; i++) {

                if (inputToNumber % i == 0) { // chisloto ne e prosto
                    prostoChislo = false;
                    neProstiChislaSum += inputToNumber;
                    break;
                }
            }
            if (prostoChislo && inputToNumber > 0) {
                prostiChislaSum += inputToNumber;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d %n", prostiChislaSum);
        System.out.printf("Sum of all non prime numbers is: %d", neProstiChislaSum);
    }
}



