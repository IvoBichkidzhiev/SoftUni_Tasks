import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int numberOfCombinations = 0;
        boolean flag = false;

        for (int i = start; i <= finish; i++) {

            for (int j = start; j <= finish; j++) {

                int sum = i + j;
                numberOfCombinations++;

                if (sum == magicNum) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", numberOfCombinations, i, j, sum);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", numberOfCombinations, magicNum);
        }
    }
}
