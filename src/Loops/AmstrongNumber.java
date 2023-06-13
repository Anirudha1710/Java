package Loops;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r,m,sum=0;
        m=n;
        while (n>0)
        {
            r=n%10;
            n/=10;
            sum+=r*r*r;
        }
        if (sum==m)
        {
            System.out.println("Amstrong Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
        sc.close();
    }
}
