package com.company;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duljinaTorta = Integer.parseInt(scanner.nextLine());
        int shirochinaTorta = Integer.parseInt(scanner.nextLine());

        int obshtBroiParcheta = duljinaTorta * shirochinaTorta;
        int vzetiParcheta = 0;

        while (true) {

            String parchetaTorta = scanner.nextLine();

            if (parchetaTorta.equalsIgnoreCase("stop")) {
                System.out.printf("%d pieces are left.", obshtBroiParcheta - vzetiParcheta);
                break;
            }

            int transfer = Integer.parseInt(parchetaTorta);
            vzetiParcheta += transfer;

            if (obshtBroiParcheta < vzetiParcheta) {
                System.out.printf("No more cake left! You need %d pieces more.", vzetiParcheta - obshtBroiParcheta);
                break;
            }

        }


    }
}
