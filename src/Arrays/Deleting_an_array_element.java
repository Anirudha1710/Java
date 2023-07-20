package Arrays;

import java.util.Scanner;

public class Deleting_an_array_element {
    public static int[] TakeUserInput(){

        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter array element: ");
        for(int i = 0; i< size; i++){

            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static   void    Delete(int[] arr,int pos) {
        int x = 0;
        int size = arr.length;
        if (pos >= 0 && pos < arr.length) {
            x = arr[pos];

            for (int i = pos; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            size--;

            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr=TakeUserInput();
        System.out.println("Enter position: ");
        int pos=s.nextInt();
        Delete(arr,pos);
    }
}
