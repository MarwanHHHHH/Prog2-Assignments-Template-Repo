// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int j =1 ; j <= n ; j++){
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x % 2 == 0) {
            x += 1; }
        
        int sumOfOdds = 0;
        for (int i = 0; i < y; i++) {
            sumOfOdds += x;
            x += 2;
        }
        System.out.println(sumOfOdds);}
    }
}