package com.permutations;
import java.util.ArrayList;
import java.util.List;

public class LegoPermutations {
    public static void main(String[] args) {
        char[] bricks = {'A', 'B', 'C'}; // Step 1: Array of LEGO bricks
        List<String> permutations = new ArrayList<>();
        generatePermutations(bricks, 0, permutations); // Step 2: Start the recursive function
        System.out.println(permutations); // Step 3: Print all permutations
    }

    static void generatePermutations(char[] bricks, int index, List<String> result) {
        System.out.println("generatePermutations---- :"+index+" result: "+result +" bricks length: "+bricks.length);
        if (index == bricks.length) { // Step 4: Base case - when all positions are fixed
            result.add(new String(bricks)); // Add the current arrangement to the result
            return;
        }
        for (int i = index; i < bricks.length; i++) { // Step 5: Try all possible swaps
            System.out.println("i "+i+" index: "+index);
            swap(bricks, index, i); // Swap the current brick with the i-th brick
            generatePermutations(bricks, index + 1, result); // Step 6: Recursively permute the remaining bricks
            System.out.println("begin-------------------Backtrack");
            swap(bricks, index, i); // Step 7: Backtrack (undo the swap)
            System.out.println("end-------------------Backtrack");
        }
    }

    static void swap(char[] arr, int index, int i) {
        System.out.println(" swap i:"+i+" index: " + index);
        System.out.println(" swap before arr[index]:"+arr[index]+" arr[i]: " + arr[i]);
        char temp = arr[index]; // Temporary variable to store one value during swap
        arr[index] = arr[i];
        arr[i] = temp;
        System.out.println(" swap after arr[index]:"+arr[index]+" arr[i]: " + arr[i]);
    }
}
