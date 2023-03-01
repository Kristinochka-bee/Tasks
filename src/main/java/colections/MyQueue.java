package colections;

import java.util.Arrays;

public class MyQueue {

    public static void main(String[] args) {
        MyQueue q = new MyQueue(3);
        q.pushToEnd(1);
        q.pushToEnd(2);
        q.pushToEnd(3);
        q.pushToEnd(4);
        q.pushToEnd(4);

        System.out.println( q.toString());
        q.remove();
        System.out.println( q.toString());

        System.out.println(q.peek());
    }
    private int[] arr;      // массив для хранения элементов queue
    private int head;      // head указывает на первый элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость arr
    private int count;      // текущий размер queue

    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = 0;
        count = 0;
    }

    public void pushToEnd(int elem) { // pushToEnd(int data) - вставляет элемент в конец queue
        if (isFull()) {
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

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[head];
    }


    public int size(){
        return capacity;
   }

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
