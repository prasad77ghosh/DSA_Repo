package arrays;

import java.util.Scanner;

public class CountEvenAndOddInArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int even = getEvenInAnArray(arr);
            System.out.println("Ans------> " + even);
            int odd = getOddInAArray(arr);
            System.out.println("Ans------>" + odd);
        }
    }

    public static int getEvenInAnArray(int[] arr) {
        int noOfEven = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 0) {
                noOfEven = noOfEven += 1;
            }
        }
        return noOfEven;
    }

    public static int getOddInAArray(int[] arr) {
        int noOfOdd = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 != 0) {
                noOfOdd = noOfOdd += 1;
            }
        }
        return noOfOdd;
    }

}
