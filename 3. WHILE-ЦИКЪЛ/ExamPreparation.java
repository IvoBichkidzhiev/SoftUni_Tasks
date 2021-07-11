import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dopustimBroiLoshiOcenki = Integer.parseInt(scanner.nextLine());
        String imeNaZadacha = scanner.nextLine();
        int ocenka = Integer.parseInt(scanner.nextLine());

        double sumaNaOcenkite = 0;
        double sredenUspeh = 0;
        int broiOcenki = 0;
        int broiLoshiOcenki = 0;
        String lastProblem = "";

        boolean produljavaDaReshava = true;


        while (!imeNaZadacha.equalsIgnoreCase("enough")) {

            broiOcenki += 1;
            sumaNaOcenkite += ocenka;
            sredenUspeh = sumaNaOcenkite / broiOcenki;

            if (ocenka <= 4) {
                broiLoshiOcenki += 1;
            }
            if (broiLoshiOcenki == dopustimBroiLoshiOcenki) {
                produljavaDaReshava = false;
                System.out.printf("You need a break, %d poor grades.", broiLoshiOcenki);
                break;
            }

            imeNaZadacha = scanner.nextLine();

            if (imeNaZadacha.equalsIgnoreCase("enough")) {
                break;
            }

            lastProblem = imeNaZadacha;
            ocenka = Integer.parseInt(scanner.nextLine());

        }
        if (produljavaDaReshava) {
            System.out.printf("Average score: %.2f%n", sredenUspeh);
            System.out.printf("Number of problems: %d%n", broiOcenki);
            System.out.printf("Last problem: %s%n", lastProblem);

        }
    }
}
