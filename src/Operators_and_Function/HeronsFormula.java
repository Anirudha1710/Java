package Operators_and_Function;
import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        double area;
        float s;
        System.out.println("Enter first sides of a triangle: ");
        x=sc.nextInt();
        System.out.println("Enter second sides of a triangle: ");
        y=sc.nextInt();
        System.out.println("Enter third sides of a triangle: ");
        z=sc.nextInt();
        s=(x+y+z)/2f;

        area=Math.sqrt(s*(s-x)*(s-y)*(s-z));  // sqrt function return's DOUBLE value.
        System.out.println("The area of triangle is: "+area);
    }
}