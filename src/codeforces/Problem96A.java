package codeforces;
import java.util.Scanner;

public class Problem96A{
    void main(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char currentGroup = s.charAt(0);
        int count = 1 ;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == currentGroup){
                count++;
            } else{
                currentGroup = s.charAt(i);
                count = 1;
            }
            if(count >= 7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}