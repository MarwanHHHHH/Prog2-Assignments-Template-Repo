// Marwan Waleed Mamdouh
// 20216258
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib1 = 0, fib2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + " ");
            int nextNum = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextNum; }

        System.out.println();
    }
}