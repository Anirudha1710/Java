package Loops;

import java.util.Scanner;

public class Sum_of_n_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("The sum of First N natural Numbers are: " + sum);
        sc.close();
    }
}
