import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char letters = text.charAt(i);

            switch (letters) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

//            if (letters == 'a')
//                sum += 1;
//            if (letters == 'e')
//                sum += 2;
//            if (letters == 'i')
//                sum += 3;
//            if (letters == 'o')
//                sum += 4;
//            if (letters == 'u')
//                sum += 5;


        }
        System.out.println(sum);

    }
}
