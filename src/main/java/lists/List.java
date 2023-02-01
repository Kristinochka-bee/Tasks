package lists;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Boris");
        newList.add("Kris");
        newList.add("Iryna");
        System.out.println(task8(newList) );

        ArrayList<Integer> newList1 = new ArrayList<>();
        newList1.add(2);
        newList1.add(4);
        newList1.add(7);
        newList1.add(1);
        System.out.println(task9(newList1));


        ArrayList<Integer> newList2 = new ArrayList<>();
        newList2.add(2);
        newList2.add(0);
        newList2.add(7);
        newList2.add(1);
        System.out.println(task10(newList2));


        ArrayList<String> newList3 = new ArrayList<>();
        newList3.add("Boris");
        newList3.add("Kris");
        newList3.add("Iryna");
        System.out.println(task11(newList3) );

        ArrayList<String> newList4 = new ArrayList<>();
        newList4.add("Boris");
        newList4.add("Kris");
        newList4.add("Iryna");
        newList4.add("Iry");
        newList4.add("Eva");
        newList4.add("Vitalik");
        System.out.println(task7(newList4) );

    }
    //Шаблон №1
    // * Возьмите список, измените все элементы в нем на новое значение
    // * Распространенный сценарий:
    // *
    // * 1.вам дан список значений
    // * 2.вы должны применить определенную операцию для изменения каждого значения
    // * 3.вернуть список со всеми этими измененными значениями
    // *
    // * Задачи:
    // * 1.У вас есть список строковых значений, и вы должны вернуть список со всеми этими строковыми значениями в нижнем регистре (или в верхнем регистре)
    // * 2.У вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
    // * 3.У вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
    // *

    public static java.util.List task1(ArrayList<String> list) {
        java.util.List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toUpperCase());
        }
        return newList;
    }

    public static java.util.List task2(ArrayList<String> list) {
        java.util.List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toLowerCase());
            System.out.println(newList);

        }
        return newList;

    }

    public static java.util.List task3(ArrayList<Integer> list) {
        java.util.List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i) * 2);
        }
        return newList;
    }

    public static java.util.List task4(ArrayList<String> list) {
        java.util.List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).length());
        }
        return newList;
    }
    //Шаблон №2
    //Возьмите список, удалите все элементы, которые не соответствуют определенным критериям.
    //Распространенный сценарий:
    //
    //1.вам дан список значений
    //2.у вас есть критерии для этих значений
    //3.вернуть список только с теми значениями из исходного списка, которые соответствуют этим критериям
    //
    //Задачи:
    //
    //1.у вас есть список значений String и вы должны вернуть список со всеми значениями String определенной длины
    //2.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
    //3.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
    //4.упражнение для списков массивов Удалить слишком короткие слова

    public static java.util.List task5(ArrayList<String> list, int size) {
        java.util.List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static java.util.List task6(ArrayList<Integer> list) {
        java.util.List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static ArrayList<String> task7(ArrayList<String> list) {
        int minLength = 4;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLength ){
                list.remove(i);
                i--;
            }
        }
        return list;


    }
    //Шаблон №3
    //Возьмите список, верните одно значение
    //Распространенный сценарий:
    //
    //1.вам дан список значений
    //2.вы берете все эти значения и вычисляете из них одно значение
    //3.вернуть это вычисленное значение
    //
    //Задачи
    //
    //1.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
    //2.у вас есть список значений int и вы должны вернуть их сумму
    //3.у вас есть список значений int и вы должны вернуть их максимум или минимум
    //4.у вас есть список String и вы должны вернуть максимальную длину

    public static String task8(ArrayList<String> list) {
        String listRow = "";
        for (int i = 0; i < list.size(); i++) {
            listRow = listRow + list.get(i) + " ";
        }

        return listRow;


    }

    public static int task9(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static ArrayList task10(ArrayList<Integer> list) {
        ArrayList<Integer> returnList = new ArrayList<>();
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        returnList.add(max);
        returnList.add(min);
        return returnList;

    }
    public static int task11(ArrayList<String> list) {
        int MaxLength = 0;
        for (int i = 0; i < list.size(); i++) {
            if (MaxLength < list.get(i).length()){
                MaxLength = list.get(i).length();
            }
        }
        return MaxLength;


    }

}
