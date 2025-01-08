package arrays;

import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int maximum = maxOfArray(arr);
            int minimum = minOfArray(arr);
            System.out.println("Maximum------> " + maximum);
            System.out.println("Minimum---------> " + minimum);
        }
    }

    public static int maxOfArray(int[] arr) {
        if (arr.length == 0)
            return 0;
        int max = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int minOfArray(int[] arr) {
        if (arr.length == 0)
            return 0;

        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;

    }
}
