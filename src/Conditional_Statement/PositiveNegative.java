package Conditional_Statement;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        // this is for if-else:
        if(number>=0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative.");
        }
    }
}
