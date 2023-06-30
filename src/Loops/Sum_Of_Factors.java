package Loops;

import java.util.Scanner;

public class Sum_Of_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int sum=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        System.out.println("The sum of factors are: "+sum);
        sc.close();
    }
}
