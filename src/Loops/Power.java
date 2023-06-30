package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        System.out.println("Enter the power: ");
        int y = sc.nextInt();
        int ans =1;
        while (y>0){
            ans*=x;
            y--;
        }
        System.out.println(ans);
        sc.close();
    }
}
