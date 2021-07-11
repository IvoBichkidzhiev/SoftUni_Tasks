import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int numbersLeft = Integer.parseInt(scanner.nextLine());

            sum1 = numbersLeft + sum1;
        }
        //   System.out.println(sum1);

        for (int i = 1; i <= n; i++) {
            int numbersRight = Integer.parseInt(scanner.nextLine());

            sum2 = numbersRight + sum2;
        }
        //   System.out.println(sum2);
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else if (sum1 != sum2) {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
