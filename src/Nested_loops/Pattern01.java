package Nested_loops;
/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */
public class Pattern01 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(j+"");
            }
            System.out.println();
        }
    }
}
