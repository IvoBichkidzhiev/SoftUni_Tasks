import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        String azbuka = "abcdefghijklmnopqrstuvwqyz";

        int m = 0;

        for (int i = 1; i <= n; i++) { //symbol #1

            for (int j = 1; j <= n; j++) { //symbol #2

                for (int k = 1; k <= l; k++) { //symbol #3

                    for (int v = 1; v <= l; v++) { //symbol #4

                        for (m = 1; m <= n; m++) { //symbol #5

                            if (m > i && m > j) {
                                System.out.print(i);
                                System.out.print(j);

                                char bukva1 = azbuka.charAt(k - 1);
                                System.out.print(bukva1);

                                char bukva2 = azbuka.charAt(v - 1);
                                System.out.print(bukva2);
                                System.out.print(m + " ");
                            }
                        }
                    }
                }
            }
        }


    }
}
