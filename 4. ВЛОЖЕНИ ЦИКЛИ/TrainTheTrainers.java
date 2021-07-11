import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juri = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double ocenkiObshto = 0.00;
        int broiPredmeti = 0;

        while (!presentation.equalsIgnoreCase("finish")) {
            double ocenkiZaPredmeta = 0.00;

            for (int i = 1; i <= juri ; i++) {
                double ocenka = Double.parseDouble(scanner.nextLine());
                ocenkiZaPredmeta += ocenka;
                ocenkiObshto += ocenka;
            }

            broiPredmeti++;
            double ocenkiSredno = ocenkiZaPredmeta / juri;
            System.out.printf("%s - %.2f. %n", presentation, ocenkiSredno);

            presentation = scanner.nextLine();
        }

        double obshtUspeh = ocenkiObshto / (juri*broiPredmeti);

        System.out.printf("Student's final assessment is %.2f.", obshtUspeh);

    }
}
