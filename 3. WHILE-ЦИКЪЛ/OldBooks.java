import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tursenataKniga = scanner.nextLine();
        String nalichniKnigi = scanner.nextLine();
        int broiKnigi = 0;
        boolean namerenaKniga = true;

        while (!nalichniKnigi.equalsIgnoreCase(tursenataKniga)) {

            if (nalichniKnigi.equalsIgnoreCase("No More Books")) {
                namerenaKniga = false;
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", broiKnigi);
                break;
            }

            broiKnigi += 1;
            nalichniKnigi = scanner.nextLine();

        }
        if (namerenaKniga) {
            System.out.printf("You checked %d books and found it.", broiKnigi);
        }
    }
}
