import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a=sc.nextDouble();
        System.out.println("Enter b: ");
        b=sc.nextDouble();
        System.out.println("The sum of two numbers are: "+(a+b));
        System.out.println("The subtraction of two numbers are: "+(a-b));
        System.out.println("The multiplication of two numbers are: "+(a*b));
        System.out.println("The quotient of two numbers are: "+(a/b));
        System.out.println("The remainder of two numbers are: "+(a%b));
    }
}
