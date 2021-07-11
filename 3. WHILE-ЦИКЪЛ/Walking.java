import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stupki = scanner.nextLine();
        int obshtoStupki = 0;

        while (true) {
            if (stupki.equalsIgnoreCase("going home")) {
                stupki = scanner.nextLine();
                int stupkiBroi = Integer.parseInt(stupki);
                obshtoStupki += stupkiBroi;
                break;
            }
            int stupkiBroi = Integer.parseInt(stupki);
            obshtoStupki += stupkiBroi;

            if (obshtoStupki >= 10000) {
                break;
            }
            stupki = scanner.nextLine();
        }
        if (obshtoStupki < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - obshtoStupki);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", obshtoStupki - 10000);
        }
    }
}
