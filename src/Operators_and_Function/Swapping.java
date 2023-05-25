package Operators_and_Function;

public class Swapping {
    public static void main(String[] args) {
        int a= 15, b=5;
        System.out.println(a+" "+b);

        /*By taking third variable
        temp = a;
        a=b;
        System.out.println(a+" "+b);

        Without taking third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
         */

        // By bitwise operator:

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);

    }
}
