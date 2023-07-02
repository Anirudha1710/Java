package Nested_loops;

import java.util.Scanner;
/*
   1
  12
 123
1234
*/
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while (i<=n)
        {
            int space=1;
            while (space<=n-i)
            {
                System.out.print(" ");
                space++;
            }
            int star=1;
            while (star<=i)
            {
                System.out.print(star);
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
