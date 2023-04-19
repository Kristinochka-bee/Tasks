package hashMap;

import colections.trees.binarytree.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        //Arrays ,Collection
        int arr0[] = {1,2,5,4,0};
        int arr10[] = {2,4,5,0,1};
        boolean result = Arrays.equals(arr0, arr10);
        System.out.println(result);

        long[] arr1 = new long[] { 767, 568, 555, 897, 678 };
        long[] arr2 = new long[] { 456, 756, 555, 999, 678};
        long[] arr3 = new long[] { 767, 568, 555, 897, 678 };
        long[] arr4 = new long[] { 767, 678, 555, 897, 568 };

        // comparing
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr2, arr3));
        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(Arrays.compare(arr1,arr4));




    }


    public static int firstElementNative(int[] arr, int n, int k) {
        // This loop is used for selection of elements
        for (int i = 0; i < n; i++) {
            int count = 0; // Count how many times selected element occurs
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) { // Check, if it occurs k times or not
                return arr[i];
            }
        }
        return -1;
    }

    public static int firstElement(int[] arr, int n, int k) {
        // unordered map to count occurrences of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = 0;
            if (map.get(arr[i]) != null) {
                a = map.get(arr[i]);
            }
            map.put(arr[i], a + 1);
        }
        for (int i = 0; i < n; i++) { // if count of element == k ,then it is the required first element
            if (map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }

    public boolean isHasRepeatedElement(ArrayList<Integer> arrayList){
        HashSet<Integer> set = new HashSet<>(arrayList);
        return set.size() != arrayList.size();
    }


}


























