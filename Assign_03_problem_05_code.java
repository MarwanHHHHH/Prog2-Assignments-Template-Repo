// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            
            if (x > y) {
                int swap = x;
                x = y;
                y = swap;
            }
            for (int j = x+1; j < y; j++) {
                if (j % 2 != 0) { 
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}