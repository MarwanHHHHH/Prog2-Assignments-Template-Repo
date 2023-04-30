// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // number of test cases
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = input.nextInt();
            }
            int minSum = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    int sum = a[j] + a[k] + j - k;
                    if (sum < minSum) { minSum = sum; }
                }
            }
            System.out.println(minSum);
        }
    }
}