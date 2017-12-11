package zad8;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        String correctPassword = "London";
        String userPassword;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Give a correct password:");
            userPassword = scanner.next();
        } while (!userPassword.equals(correctPassword));
                System.out.println("Correct password! :) ");

    }
}
