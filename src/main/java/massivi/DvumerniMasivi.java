package massivi;

import java.util.Arrays;

public class DvumerniMasivi {
    public static void main(String[] args) {


        //**
        // *  Создать многомерный массив 10 x 10. Заполнить его символом # таким образом,
        // *  как это указанно ниже.
        // *  И вывести в консоль.
        // *
        // *  ######
        // *  #    #
        // *  #    #
        // *  ######
        // *
        // */

        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++) {//по столбцам проходимся
            for (int j = 0; j < array[i].length; j++) {//по строкам проходимя
                if (i == 0 || i == 9) {
                    array[i][j] = '#';
                } else if (j == 0 || j == 9) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        //print
        for (int i = 0; i < array.length; i++) {//по столбцам проходимся
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {//по строкам проходимя
                System.out.print(array[i][j] + " ");

            }

        }
        //Task3: Создать многомерный массив 10 x 10.
        // Заполнить его  числами jn 0 до 100  и вывести в консоль таким образом, как это указанно ниже.
        //1   2   3  4  5  6  7  8  9  10
        //11 12 13 14 15 16 17 18 19 20
        //21 22 23 24 25 26 27 28 29 30
        //31 32 33 34 35 36 37 38 39 40
        //41 42 43 44 45 46 47 48 49 50
        //51 52 53 54 55 56 57 58 59 60
        //61 62 63 64 65 66 67 68 69 70
        //71 72 73 74 75 76 77 78 79 80
        //81 82 83 84 85 86 87 88 89 90
        //91 92 93 94 95 96 97 98 99 100

        String[][] arr = new String[10][10];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 && j < 9) {
                    arr[i][j] = String.valueOf(num + 1) + " "; // от еденицы начинается
                } else {
                    arr[i][j] = String.valueOf(num + 1); // без пробела
                }
                num++;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        //Task4: Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
        // Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
        //
        //
        //Пример симметричного массива.
        //
        //
        //int[][] array = {
        //                {2, 3, 5, 10, 11},
        //                {3, 2, 4,  6, 9},
        //                {5, 4, 2,  7, 12},
        //                {10, 6, 7, 2,  8},
        //                {11, 9, 12, 8, 2}};
        //
        //
        //Пример несимметричного массива.
        //
        //
        //int[][] array = {
        //                {2, 3, 5, 10, 222},
        //                {3, 2, 4,  6, 9},
        //                {5, 4, 2,  7, 12},
        //                {10, 6, 7, 2,  8},
        //                {11, 9, 12, 8, 2}};


        int[][] array1 = {
                {2, 3, 5, 10, 222},
                {3, 2, 4, 6, 9},
                {5, 4, 2, 7, 12},
                {10, 6, 7, 2, 8},
                {11, 9, 12, 8, 2}};

        boolean isSimetric = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array1[j][i]) {
                    isSimetric = false;
                }
            }
        }
        System.out.println(isSimetric);



        //Task5:  Написать метод реализующий бинарный поиск. Метод должен выводить в консоль ID найденного элемента и количество
        //сделанных сравнений. Выяснить какое максимальное количество сравнений нам необходимо для поиска элемента в массиве состоящим из миллиона элементов.

        int[] array2 = new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i]= (int) (Math.random()*100 + 1);
        }
        int[] arraySorted = Arrays.stream(array2).sorted().toArray();

        System.out.println(binarySearch(arraySorted,18,0,99));
        System.out.println(Arrays.toString(arraySorted));
    }

    public static String binarySearch(int [] arraySorted , int number, int low , int high ) {

        int counter = 0;
        int index = -1;           // в том случае если элемент не найден
        high = arraySorted.length - 1;  //чтоб не выйти за пределы нашего массива в процессе поиска


        while (low <= high){
            int mid = ( high + low)/2; // делим массив паполам
            if (arraySorted[mid] < number){
                low = mid +1;
                counter++;
            }else if (arraySorted[mid] > number){
                high = mid-1;
                counter++;
            }else if (arraySorted[mid] == number){
                index = mid;
                break; //значит нашли наше число


            }
        }
        return " idex:" +index + " " + "количество сравнений : "+ counter;



    }
}
