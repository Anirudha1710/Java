package Conditional_Statement;

import java.util.Scanner;

public class printing_grade {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        float m1,m2,m3,avg;
        System.out.println("Enter the marks of subject 1: ");
        m1 = sc.nextFloat();
        System.out.println("Enter the marks of subject 2: ");
        m2 = sc.nextFloat();
        System.out.println("Enter the marks of subject 3: ");
        m3 = sc.nextFloat();
        avg = (m1+m2+m3)/3;

        if(avg>=90){
            System.out.println("S grade");
        }
        else if(avg>=80 && avg<90){
            System.out.println("A grade");
        }
        else if(avg>=70 && avg<80){
            System.out.println("B grade");
        }
        else if(avg>=60 && avg<70){
            System.out.println("C grade");
        }
        else if(avg>=50 && avg<60){
            System.out.println("D grade");
        }
        else if(avg>=33 && avg<50){
            System.out.println("E grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
