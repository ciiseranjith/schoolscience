// Java program to find the maximum element in an array

import java.util.*;

public class MaximumElement {
   public static void main(String[] args) {
      // Create an array of 10 elements
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      // Initialize the maximum element to the first element
      int max = arr[0];

      // Traverse the array and compare each element with the current maximum element
      for (int i=1; i<arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }

      // Print the maximum element
      System.out.println("Maximum element is " + max);
   }
}
