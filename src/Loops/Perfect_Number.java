package Loops;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        int sum = 0;
        for(int i=1; i<=x;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        if((2*x)==sum){
            System.out.println("Perfect Number.");
        }
        else{
            System.out.println("Not a Perfect Number.");
        }
        sc.close();
    }
}
