import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shirochina = Integer.parseInt(scanner.nextLine());
        int duljina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());
        String done = scanner.nextLine();

        int obemNaStaqta = shirochina * duljina * visochina;
        int obemNaKashonite = 0;

        while (!done.equalsIgnoreCase("done")) {
                int kashoni = Integer.parseInt(done);
                obemNaKashonite +=kashoni;

                if(obemNaKashonite >= obemNaStaqta) {
                    System.out.printf("No more free space! You need %d Cubic meters more.",
                            obemNaKashonite - obemNaStaqta);
                    break;
                }

                done = scanner.nextLine();
        }
            if (obemNaKashonite < obemNaStaqta) {
                System.out.printf("%d Cubic meters left.", obemNaStaqta - obemNaKashonite);
            }
    }
}
