import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double volumeSales = Double.parseDouble(scanner.nextLine());
        double commision = 0.00;

        if (city.equals("Sofia")) {
            if (volumeSales >= 0 && volumeSales <= 500) {
                commision = 0.05;
            } else if (volumeSales >= 0 && volumeSales <= 1000) {
                commision = 0.07;
            } else if (volumeSales >= 0 && volumeSales <= 10000) {
                commision = 0.08;
            } else if (volumeSales >= 0 && volumeSales > 10000) {
                commision = 0.12;
            } else { //pri nevaliden obem na prodajbi
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (volumeSales >= 0 && volumeSales <= 500) {
                commision = 0.045;
            } else if (volumeSales >= 0 && volumeSales <= 1000) {
                commision = 0.075;
            } else if (volumeSales >= 0 && volumeSales <= 10000) {
                commision = 0.10;
            } else if (volumeSales >= 0 && volumeSales > 10000) {
                commision = 0.13;
            } else { //pri nevaliden obem na prodajbi
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (volumeSales >= 0 && volumeSales <= 500) {
                commision = 0.055;
            } else if (volumeSales >= 0 && volumeSales <= 1000) {
                commision = 0.08;
            } else if (volumeSales >= 0 && volumeSales <= 10000) {
                commision = 0.12;
            } else if (volumeSales >= 0 && volumeSales > 10000) {
                commision = 0.145;
            } else { //pri nevaliden obem na prodajbi
                System.out.println("error");
            }
        } else { //pri nevaliden grad
            System.out.println("error");
        }
        if (commision * volumeSales != 0)
        System.out.printf("%.2f", commision * volumeSales);
    }
}
