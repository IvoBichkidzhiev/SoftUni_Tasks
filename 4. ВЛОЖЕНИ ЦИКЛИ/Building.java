import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int etaji = Integer.parseInt(scanner.nextLine());
        int staiNaEtaj = Integer.parseInt(scanner.nextLine());

        for (int i = etaji; i >= 1; i--) {

            for (int j = 0; j < staiNaEtaj; j++) {

                if (i == etaji) {
                    System.out.printf("L%d%d ", etaji, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }

            System.out.printf("%n");
        }

    }
}
