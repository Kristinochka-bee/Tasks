package comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name and Number comparator _________________________________________________________________________________________________________________");
        List<Car> list = new LinkedList<>();
        Car car1 = new Car("Mercedes", 376, 2, 40000);
        Car car2 = new  Car("BMW", 254, 1, 65000);
        Car car3 = new  Car("Volkswagen", 196, 5, 15000);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        //System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        System.out.println("AgeComparator,TreeSet_________________________________________________________________________________________________________________");
        //HashSet , TreeSet гарантируют коллекцию элементов без дубликатов
        Set<Car> set = new TreeSet<>(new AgeComparator());  // не доаускает дубликаты в соответствии с указанным компоратором
        Car c1 = new Car("Mercedes", 376, 2, 40000);
        Car c2 = new  Car("BMW", 254, 1, 65000);
        Car c3 = new  Car("Volkswagen", 196, 5, 15000);
        Car c4 = new  Car("Nisan", 2504, 8, 10000);
        Car c5 = new  Car("Smart", 2475, 5, 12000);
        Car c6 = new  Car("Mitsubishi", 2678, 5, 20000);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c6); // не включит в список из-за укащанного по возрасту компаратора
        set.remove(c1);
        System.out.println(set);
        System.out.println();

        System.out.println("HashSet------------------------------------------------------------------------------------__________________________");

        Set<Car> set1 = new HashSet<>(); //не дает никаких гарантий относительно порядка итерации
        set1.add(c1);
        set1.add(c2);
        set1.add(c3);
        set1.add(c4);
        set1.add(c5);
        set1.add(c6); // внесет в список в рандомном порядке

        Car c7 = new  Car("Mitsubishi", 2678, 5, 20000);
        set1.add(c7); //не создаст дубликат

        System.out.println(set1);

        System.out.println("Queue------------------------------------------------------------------------------------__________________________");
       //первый пришел, первый ушел
        Queue<Car> queue = new LinkedList<>();
        queue.add(c1);
        queue.add(c2);
        queue.add(c3);
        queue.add(c4);
        queue.add(c5);
        System.out.println(queue);

        queue.remove(); //первый пришел, первый ушел
        System.out.println(queue);
        System.out.println();








    }
}