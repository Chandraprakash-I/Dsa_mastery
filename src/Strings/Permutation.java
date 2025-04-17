package Strings;


import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String str = "aad";
        generatePermutations(str);
    }

    public static void generatePermutations(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        int[] c = new int[n]; // Control array for swaps
        Arrays.fill(c, 0);

        System.out.println(String.valueOf(arr)); // Print first permutation

        int i = 0;
        while (i < n) {
            if (c[i] < i) {
                int swapIndex = (i % 2 == 0) ? 0 : c[i]; // Swap with first or c[i] index
                swap(arr, swapIndex, i);
                System.out.println(String.valueOf(arr)); // Print next permutation
                c[i]++;
                i = 0; // Reset index
            } else {
                c[i] = 0;
                i++;
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
