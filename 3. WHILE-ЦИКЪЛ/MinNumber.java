import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = scanner.nextLine();
        int mibNum = Integer.MAX_VALUE;

        while (!stop.equalsIgnoreCase("stop")) {
            int num = Integer.parseInt(stop);
            if(num < mibNum) {
                mibNum = num;
            }
            stop = scanner.nextLine();
        }
        System.out.println(mibNum);
    }
}
