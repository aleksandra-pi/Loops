package zad5;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<= n; i++) {
            sum+= 1; // sum = sum + 1
        }

        if (n%2 == 0) {
            System.out.println((n / 2) * (n + 1));
        } else

        System.out.println((n+1)/2 *n );

        }
    }
