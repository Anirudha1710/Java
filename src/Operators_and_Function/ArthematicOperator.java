package Operators_and_Function;
public class ArthematicOperator {
    public static void main(String[] args){
        // Difference between "/","%" operators:
        int x=15,y=4;
        int z=x/y;
        int q=x%y;
        System.out.println(z);
        System.out.println(q);

        // Arthmetic operators on float:
        float p=(float) x/y;
        System.out.println(p);

        // Operations on different data types:
        byte h = 15;
        short i = 5;
        System.out.println(h+i);

        int j= 5;
        float k= 12.5f;
        System.out.println(j+k);

        char l='a';
        int m=7;
        System.out.println((l+m));
        System.out.println((char) (l+m));

        long n=4569L;
        double o=45.3;
        System.out.println((n/o));
    }
}

