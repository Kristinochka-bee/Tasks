package arrays.sort;

//Как отсортировать массив в порядке возрастания в Java с помощью Arrays.sort()

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 8, 10 }; //создали массив с числами в случайном порядке
        Arrays.sort(arr); //Чтобы отсортировать этот массив в порядке возрастания, мы передали массив в качестве параметра методу sort()

        for (int value : arr) { //создали цикл
            System.out.println(value);
        }
    }

}
