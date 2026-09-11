package codeforces.strings.normalization;

import java.util.Scanner;

public class Problem71A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
