import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (partOfTheDay.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 10 && degrees <= 18) {
            if (partOfTheDay.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (partOfTheDay.equals("Afternoon")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (partOfTheDay.equals("Morning")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (partOfTheDay.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (degrees >= 25) {
            if (partOfTheDay.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (partOfTheDay.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
