package Loops;

import java.util.Scanner;

public class Reversing_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r,m,rev=0;
        m=n;
        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if (rev==m)
        {
            System.out.println("Pallindrome Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
        sc.close();
    }
}
