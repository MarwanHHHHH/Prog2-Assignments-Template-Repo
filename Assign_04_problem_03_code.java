// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);
    }
}