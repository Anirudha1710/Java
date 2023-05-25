package Operators_and_Function;

import java.util.Scanner;

public class Roots_of_Quadratic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        r1 = (-b+ sqrt)/(2*a);
        r2 = (-b- sqrt)/(2*a);
        System.out.println("Roots are: "+r1+","+r2);
    }
}
