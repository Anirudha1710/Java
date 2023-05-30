package Conditional_Statement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        // This is for if-else:
        if(number%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}
