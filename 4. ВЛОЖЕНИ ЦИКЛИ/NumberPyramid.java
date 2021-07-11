import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean flag = false;


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                sum++;
                System.out.print(sum + " ");

                if (sum >= n) {
                    flag = true;
                    break;
                }
            }

            System.out.println();

            if (flag) {
                break;
            }
        }

    }
}
