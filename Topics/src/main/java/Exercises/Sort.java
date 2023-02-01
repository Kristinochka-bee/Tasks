package Exercises;

import arrays.sort.ArraysSort;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 8, 10 }; //создали массив с числами в случайном порядке

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        System.out.println(Arrays.toString(arr));
        }
    }

