package Methods;

import java.util.Scanner;

//nCr= n!/(r!*(n-r)!)
public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();

        int factn=1;
        for(int i=1;i<=x;i++){
            factn*=i;
        }
        int factr=1;
        for (int i=1;i<=y;i++){
            factr*=i;
        }
        int factnr=1;
        for (int i=1;i<=x-y;i++)
        {
            factnr*=i;
        }

        int result=factn/(factr*factnr);
        System.out.println(result);
    }
}
