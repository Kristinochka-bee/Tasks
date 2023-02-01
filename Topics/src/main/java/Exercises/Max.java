package Exercises;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 8, 10 };
        System.out.println(findMaxIterative(arr));
    }
    private static int findMaxIterative(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

}
