package colections;

import java.util.Arrays;

public class Queue {
    // Классическая Queue - реализовать используя массив (Array)
    //    pushToEnd(int data) - вставляет элемент в конец queue
    //    remove() - удаляет элемент из начала queue
    //    peek() - возвращает элемент из начала не удаляя его
    //    isEmpty()
    //    size()
    //
    //начало:
        private int[] arr;      // массив для хранения элементов queue
        private int head;      // head указывает на первый элемент в queue
        private int tail;       // tail часть указывает на последний элемент в queue
        private int capacity;   // максимальная емкость queue
        private int count;      // текущий размер queue




    //// Конструктор для инициализации queue
    public static void main(String[] args) {

        Queue q = new Queue(3);
        q.pushToEnd(1);
        q.pushToEnd(2);
        q.pushToEnd(3);
        q.pushToEnd(5);
        q.remove();
        System.out.println(q);


    }

    public Queue(int size){
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = 0;
        count = 0;
    }

    public void pushToEnd(int elem){

        if (isFull() ){
            System.out.println("Queue is full");

        }else{
            arr[tail] = elem;  // на нулевой индекс добавляем элемент
            tail +=1; // и так далее на последующий 1 элемент
            count++;
        }

    }
    boolean isFull(){
        if(tail >= capacity){
            return true;
        } else {
            return false;
        }
   }

   boolean isEmpty(){
        if (count == 0){
            return true;
        }else {
            return false;
        }
   }

   public void remove(){   //удаляет элемент из начала queue
        if (isEmpty()){
            System.out.println("Queue is empty");
        }else {
            int[] array = new int[capacity] ; //создаем идентичный new array первому массиву массивy arr
            int counter = 1;  //начитает идти с со второго индекса по arr
            for (int i = 0; i < arr.length; i++) {
                if (counter == arr.length){ //когда коунтер доходит до конца массива arr
                    array[i] = 0; // то заполняем нулями все остальное в конце нового массива
                    continue;
                }
                array[i] = arr[counter]; // заполняем новый массив числами из старого arr , кот начинается с индекса 1
                counter++;
            }
            arr = array;  // заменяем старый арр на новый
            tail --;
        }
   }

   public void peek(){}


    @Override
    public String toString() {
        return "Queue{" +
                "arr=" + Arrays.toString(arr) +
                ", head=" + head +
                ", tail=" + tail +
                ", capacity=" + capacity +
                ", count=" + count +
                '}';
    }
}
