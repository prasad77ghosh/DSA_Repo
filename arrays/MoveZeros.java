package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int[] ansArr = moveZerosToEnd(arr);
            System.out.println("Ans------> " + Arrays.toString(ansArr));
        }
    }

    public static int[] moveZerosToEnd(int[] arr) {
        int zeroIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zeroIdx] = arr[i];
                zeroIdx++;
            }
        }

        while (zeroIdx < arr.length) {
            arr[zeroIdx] = 0;
            zeroIdx++;
        }

        return arr;
    }
}
