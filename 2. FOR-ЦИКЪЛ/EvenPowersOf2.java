import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 1;

        for (int i = 1; i <= n + 1; i++) {

            if (i != 1) {
                sum *= 2;
            }
            if (i % 2 != 0) {
                System.out.println(sum);
            }
        }

    }
}

