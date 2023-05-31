package Conditional_Statement;

import java.util.Scanner;

public class Gretest_Among_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();

        // if-else:
        if(a>b && a>c){
            System.out.println("a is greatest number.");
        } else if (b>c) {
            System.out.println("b is greatest number.");
        }
        else {
            System.out.println("c  is greatest number.");
        }
    }
}
