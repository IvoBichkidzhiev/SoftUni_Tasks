import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chasNaIzpita = Integer.parseInt(scanner.nextLine());
        int minutaNaIzpita = Integer.parseInt(scanner.nextLine());
        int chasNaPristigane = Integer.parseInt(scanner.nextLine());
        int minutaNaPristigane = Integer.parseInt(scanner.nextLine());

        // da napravim vsichko v minuti
        int sumaMinNaIzpita = chasNaIzpita * 60 + minutaNaIzpita;
        int sumaMinNaPristigane = chasNaPristigane * 60 + minutaNaPristigane;

        int razlikaMejduDvete = Math.abs(sumaMinNaIzpita - sumaMinNaPristigane);

        // da gi prevurnem v chasove i minuti

        int chasove = razlikaMejduDvete / 60;
        int minuti = razlikaMejduDvete % 60;


        if (sumaMinNaIzpita < sumaMinNaPristigane) { //zakuisnql
            System.out.println("Late");
            if (chasove >= 1) {
                System.out.printf("%d:%02d hours after the start", chasove, minuti);
            } else {
                System.out.printf("%d minutes after the start", minuti);
            }

        } else if (sumaMinNaIzpita - sumaMinNaPristigane <= 30) { //na vreme
            System.out.println("On time");
            System.out.printf("%d minutes before the start", minuti);
        } else if (sumaMinNaIzpita - sumaMinNaPristigane > 30) { //podranil
            System.out.println("Early");
            if (chasove >= 1) {
                System.out.printf("%d:%02d hours before the start", chasove, minuti);
            } else {
                System.out.printf("%d minutes before the start", minuti);
            }
        }


    }
}
