package Methods;

import java.util.Scanner;

public class problem_i {
    public static boolean isPrime(int n) {
        for(int i=2;i>n/2;i++){
            if ((n%i)==0)
                return false;
        }
        return true;
    }
    public static int GDC(int m,int n){
        while (m!=n){
            if (m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x=sc.nextInt();
        // System.out.println(inPrime(x));
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("GDC of "+m+"and"+n+"is"+GDC(m,n));
    }
}
