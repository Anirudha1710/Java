package Arrays;
import java.util.Scanner;

public class Number_of_positive_negative_zero {
    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void Count(int[] arr) {
        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positive++;
            else if (arr[i] < 0)
                negative++;
            else
                zero++;
        }
        System.out.print("\nNumber of Positive elements: " + positive);
        System.out.print("\nNumber of Negative elements: " + negative);
        System.out.print("\nNumber of zero elements: " + zero);

    }

    public static void main(String[] args) {

        int[] arr = TakeUserInput();
        Count(arr);
    }
}
