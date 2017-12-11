package zad6;

import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        int correctNumber = 600;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n > correctNumber) {
                System.out.println("Need to give a lower number");
            } else if (n < correctNumber) {
                System.out.println("Need to give a bigger number");
            }

        } while (n != correctNumber);
            System.out.println("Congratulations!");
    }
}
