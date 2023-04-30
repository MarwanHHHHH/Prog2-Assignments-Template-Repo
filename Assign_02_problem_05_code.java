// Marwan Waleed Mamdouh
// 20216258

import java.util.Scanner;

public class lap {
    public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       int size=sc.nextInt();
       int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {
             boolean isPrime = true;
             for(int k=2;k<=array[j]/2;k++)
            {
                if(array[j]%k==0)
                {
                    isPrime = false;
                    break;
                }
            }
             if(isPrime)
                 System.out.println("Prime");
             else
                 System.out.println("Not");
        }
    }
}