import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!stop.equalsIgnoreCase("stop")) {
            int num = Integer.parseInt(stop);
            if(num > maxNum) {
                maxNum = num;
            }
            stop = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
