package codeforces.bruteforce;

import java.util.Scanner;

public class Problem231A_Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int solveds = 0;

        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            if (petya + vasya + tonya >= 2) {
                solveds++;
            }
        }

        System.out.println(solveds);
    }
}