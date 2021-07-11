import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double  n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double operations = 0;
        boolean evenOrNot = false;


        switch (operator) {
            case "+":
                operations = n1 + n2;
                evenOrNot = operations % 2 == 0;

                break;
            case "-":
                operations = n1 - n2;
                evenOrNot = operations % 2 == 0;
                break;
            case "*":
                operations = n1 * n2;
                evenOrNot = operations % 2 == 0;
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    operations = n1 / n2;
                    System.out.printf("%.0f / %.0f = %.2f", n1, n2, operations);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    operations = n1 % n2;
                    String percent = "%";
                    System.out.printf("%.0f %s %.0f = %.0f", n1, percent, n2, operations);
                }
                break;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (evenOrNot) {
                System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator, n2, operations, "even");
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator, n2, operations, "odd");
            }
        }

    }
}
