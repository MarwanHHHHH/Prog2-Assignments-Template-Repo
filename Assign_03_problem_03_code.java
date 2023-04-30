// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int num = 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("PUM"); 
            num++;
        }
    }
}