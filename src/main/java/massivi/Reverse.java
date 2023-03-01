package massivi;

import java.util.Arrays;

public class Reverse {
            //    Given an array 'arr[]' of positive integers, flip each group of subarrays to size 'K.'
//
//    Example 1:
//    K = 3
//    arr[] = {1,2,3,4,5}
//    Output: 3 2 1 5 4
//    Explanation: The first group consists of elements
//1, 2, 3. The second group consists of 4,5.
//
//    Example 2:
//    K = 3
//    arr[] = {5,6,8,9}
//    Output: 8 6 5 9
//
//    Your task:
//    To write a reverse (arr, k) function that takes 'arr[]' and 'K' as input and modifies the array into place.pu

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
//        reverse(arr, 3);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
//        reverse(arr1, 4);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{1, 2, 3, 4, 5};
//        reverse(arr2, 2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // start of first subgroup = 0
        // start of second subgroup = 4
        // start of third subgroup = 8
        reverse(arr3, 4);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        reverse(arr4, 4);
        System.out.println(Arrays.toString(arr4));

    }

    public static void reverse(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            if (arr.length - i > k) {
                reverseSubArrayInTheMiddle(arr, i, k);
            }
            else {
                // last subgroup could have less than k elements
                reverseSubArrayInTheMiddle(arr, i, arr.length - i);
            }
        }
    }

    public static void reverseEnhanced(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            reverseSubArrayInTheMiddle(arr, i, Math.min(arr.length - i, k));
        }
    }

    // arr[] = {5,6,8,9}
    // result {9,8,6,5}
    private static void reverseWholeArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
// same
//            int tmp2 = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = arr[i];
//            arr[i]  = tmp2;
        }
    }
    // i = 0 => arr.length - 1 - i = arr.length - 1  (last)
    // i = 1 => arr.length - 1 - i = arr.length - 2  (pre last)

        // i = 0
        // arr[0] swap arr[arr.length - 1]

        // i = 1
        // arr[1] swap arr[arr.length - 2]

    private static void reverseSubArray(int[] arr, int k) {
        for (int i = 0; i < k / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = tmp;
        }
    }

        //    private static void printFirstFourElementsInArray(int[] arr) {
//        for (int i = 0; i < 4; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    // arr[] = {1,2,3,4,5,6,7,8,9}
    // shift = 2
    // k = 5
    // arr[] = {1,2,7,6,5,4,3,8,9}
    // развернуть k элементов, начиная с shift индекса
    private static void reverseSubArrayInTheMiddle(int[] arr, int shiftIdx, int k) {
        for (int i = 0; i < k / 2; i++) {
            int tmp = arr[shiftIdx + i];
            arr[shiftIdx + i] = arr[shiftIdx + k - 1 - i];
            arr[shiftIdx + k - 1 - i] = tmp;
        }
    }
}
