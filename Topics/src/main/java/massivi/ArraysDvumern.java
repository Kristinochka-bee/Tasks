package massivi;

public class ArraysDvumern {
    public static void main(String[] args) {
        /*

        int [][] array2 = new int[3][3];

        //1 0 0
        //0 4 0
        //0 0 9

        array2 [0][0] = 1;
        array2 [1][1] = 4;
        array2 [2][2] = 9;

        System.out.println(array2[2][2]);
        System.out.println(array2[1][1]);



        int[][] array3 = {{1,2,3,4},{5,6,7,8}};
        System.out.println(Arrays.deepToString(array3));  //Быстрый вывод двумерного массива
        System.out.println(array3.length); //длина массива



         */


        //

        int[][] arrray4 = new int[5][5];
        for (int i = 0; i < arrray4.length; i++) { //по столбцам проходимся
            for (int j = 0; j < arrray4[i].length; j++) { //по строкам проходимя
                arrray4[i][j] = i;
            }
        }
        for (int i = 0; i < arrray4.length; i++) { //по столбцам проходимся
            System.out.println();
            for (int j = 0; j < arrray4[i].length; j++) { //по строкам проходимя
                System.out.print(arrray4[i][j]);

                //00000
                //11111
                //22222
                //33333
                //44444

            }
        }

        //Вывод значений от 0 до 25

        int[][] array5 = new int[5][5];
        int number = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = number;
                number++;

            }
        }
        for (int i = 0; i < array5.length; i++) {
            System.out.println();
            for (int j = 0; j < array5[i].length; j++) {
                System.out.print(array5[i][j] + " ");
            }
        }
        //Создать многомерный массив 4 x 6. Заполнить его символом #
        // *  и вывести в консоль.
        char[][] arrray6 = new char[4][6];
        for (int i = 0; i < arrray6.length; i++) { //по столбцам проходимся
            for (int j = 0; j < arrray6[i].length; j++) { //по строкам проходимя
                arrray6[i][j] = '#';
            }
        }
        for (int i = 0; i < arrray6.length; i++) { //по столбцам проходимся
            System.out.println();
            for (int j = 0; j < arrray6[i].length; j++) { //по строкам проходимя
                System.out.print(arrray6[i][j]);
            }

        }

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

        char[][] array7 = new char[10][10];
        for (int i = 0; i < array7.length; i++) { //по столбцам проходимся
            for (int j = 0; j < array7[i].length; j++) { //по строкам проходимя
                array7[i][j] = '#';
            }
        }
        for (int i = 0; i < array7.length; i++) { //по столбцам проходимся
            System.out.println();
            for (int j = 0; j < array7[i].length; j++) { //по строкам проходимя
                System.out.print(array7[i][j]);
            }

        }


    }
}
