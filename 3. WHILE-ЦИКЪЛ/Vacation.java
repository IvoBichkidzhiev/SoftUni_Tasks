import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pariZaEkskurziqta = Double.parseDouble(scanner.nextLine());
        double nalichniPari = Double.parseDouble(scanner.nextLine());
        int posledovatelniDniZaHarchluk = 0;
        int dniObshto = 0;

        while (true) {

            String deistvie = scanner.nextLine(); //spend or save

            double suma = Double.parseDouble(scanner.nextLine());

            if (deistvie.equalsIgnoreCase("spend")) {
                nalichniPari -= suma;
                dniObshto++;
                posledovatelniDniZaHarchluk++;

                if (nalichniPari <= 0) {
                    nalichniPari = 0;
                }
                if (posledovatelniDniZaHarchluk == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(dniObshto);
                    break;
                }
            } else if (deistvie.equalsIgnoreCase("save")) {
                posledovatelniDniZaHarchluk = 0;
                dniObshto++;
                nalichniPari += suma;
                if (nalichniPari >= pariZaEkskurziqta) {
                    System.out.printf("You saved the money for %d days.", dniObshto);
                    break;
                }
            }
        }


    }
}
