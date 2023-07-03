package Methods;

import java.util.Scanner;

public class nCr_Using_Functions {
    public static int factorial(int num)
    {
        int fact=1;
        for (int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        nCr_Using_Functions mp = new nCr_Using_Functions();
        int factn = mp.factorial(x);
        int factr = factorial(y);
        int factnr = factorial(x - y);

        int result = factn / (factr * factnr);
        System.out.println(x + "C" + y + " = " + result);
    }
}
