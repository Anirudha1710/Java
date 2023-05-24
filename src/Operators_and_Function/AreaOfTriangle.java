package Operators_and_Function;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        float base, height,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height=sc.nextFloat();
        System.out.println("Enter Base: ");
        base=sc.nextFloat();
        area=base*height/2;
        System.out.println("Area of triangle is: "+area);
    }
}
