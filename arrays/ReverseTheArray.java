package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int[] ansArr = reverseArray(arr);
            System.out.println("Ans------> " + Arrays.toString(ansArr));
        }
    }

    public static int[] reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }
}
