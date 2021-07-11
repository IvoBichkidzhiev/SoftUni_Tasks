import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());


        for (int i = a; i <= b; i++) {

            int evenSum = 0;
            int oddSum = 0;
            int promenliva = i;

            for (int j = 6; j >= 1; j--) {

                if (j % 2 == 0) {
                    int cifra = promenliva % 10;
                    evenSum += cifra;
                    promenliva /= 10;
                } else {
                    int cifra = promenliva % 10;
                    oddSum += cifra;
                    promenliva /= 10;
                }

            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }

    }
}
