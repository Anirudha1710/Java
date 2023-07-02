package Nested_loops;

public class Pattern18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5-i+1; j++)
            {

                System.out.print(5-i+1);
            }
            System.out.println();
        }
    }
}
