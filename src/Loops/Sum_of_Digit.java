package Loops;

import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r,sum=0;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            sum+=r;
        }
        System.out.println(sum);

        sc.close();
    }
}
