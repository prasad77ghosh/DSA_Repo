package arrays;

import java.util.Scanner;

public class SumOfElement {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter the number of elements: ");
         int n = input.nextInt();

         int[] arr = new int[n];
         for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
         }
         int ans = sumOfElements(arr);
         System.out.println("Ans------> " + ans);
      }
   }

   public static int sumOfElements(int[] arr) {
      int sum = 0;

      for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
      }
      return sum;
   }
}
