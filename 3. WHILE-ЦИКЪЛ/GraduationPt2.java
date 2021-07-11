import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sumOcenki = 0.00;
        double broiOcenki = 0;
        boolean zavurshil = true;


        while (true) {
            double godishniOcenki = Double.parseDouble(scanner.nextLine());
            sumOcenki += godishniOcenki;
            broiOcenki += 1;

            if (godishniOcenki < 4) {
                zavurshil = false;
                System.out.printf("%s has been excluded at %.0f grade%n", name, broiOcenki);
                break;
            } else if (broiOcenki >= 12) {
                break;
            }
        }


        if (zavurshil) {
            System.out.printf("%s graduated. Average grade: %.2f%n", name, sumOcenki / broiOcenki);
        }

    }
}

