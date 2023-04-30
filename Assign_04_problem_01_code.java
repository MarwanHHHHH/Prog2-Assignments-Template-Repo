// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0 ; j<n ; j++){
            if(arr[j]>0){ System.out.print("1 ");}
            else if(arr[j]<0){System.out.print("2 ");}
            else {System.out.print("0 ");}
        }
        }
}