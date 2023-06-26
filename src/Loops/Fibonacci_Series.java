package Loops;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term: ");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+","+b+",");
        for(int i=0;i<n-n;i++){
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
        sc.close();
    }
}
