package codeforces.bruteforce;

import java.util.Scanner;

public class Problem4A_Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        System.out.println(w > 2 && w % 2 == 0 ? "YES" : "NO");
    }
}
