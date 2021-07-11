import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resto = Double.parseDouble(scanner.nextLine());
        int broiMoneti = 0;

        resto = Math.floor(resto * 100); //prevrushtame vsi4ko v stotinki

        while (resto != 0) {

            if (resto / 200 >= 1) {
                resto -= 200;
            } else if (resto / 100 >= 1) {
                resto -= 100;
            } else if (resto / 50 >= 1) {
                resto -= 50;
            } else if (resto / 20 >= 1) {
                resto -= 20;
            } else if (resto / 10 >= 1) {
                resto -= 10;
            } else if (resto / 5 >= 1) {
                resto -= 5;
            } else if (resto / 2 >= 1) {
                resto -= 2;
            } else if (resto / 1 >= 1) {
                resto -= 1;
            }
            broiMoneti++;
        }
            System.out.println(broiMoneti);

    }
}
