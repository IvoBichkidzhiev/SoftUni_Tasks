import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(scanner.nextLine());
            // trqbva da kajem subirai mi i=1 + i=3; i mi suberi i=2 + i=3
            if (i % 2 == 0) {
                evenNumbers += num;

            } else {
                oddNumbers += num;
            }
        }
        if (evenNumbers == oddNumbers) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddNumbers);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddNumbers - evenNumbers));
        }
    }
}
