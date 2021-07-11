import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumNumbers = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sumNumbers += number;

            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        if (2 * maxNumber == sumNumbers) {
            System.out.printf("Yes%nSum = %d", maxNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNumber - (sumNumbers - maxNumber)));
        }
    }
}
