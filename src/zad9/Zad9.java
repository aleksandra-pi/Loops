package zad9;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int score = 1;
        for (int i=1; i<=n; i++){
            score*=i;
        }
        System.out.println(score);
    }
}
