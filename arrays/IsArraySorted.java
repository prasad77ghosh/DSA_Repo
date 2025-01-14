package arrays;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            boolean ans = isArraySorted(arr);
            System.out.println("Ans------> " + ans);
        }
    }

    public static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
