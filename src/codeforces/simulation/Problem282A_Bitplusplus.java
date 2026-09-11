package codeforces.simulation;

import java.util.Scanner;

public class Problem282A_Bitplusplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 0;
        for(int i = 0; i < n; i++){
            if(scanner.nextLine().contains("+")){
                x++;
            } else{
                x--;
            }
        }

        System.out.println(x);
    }
}
