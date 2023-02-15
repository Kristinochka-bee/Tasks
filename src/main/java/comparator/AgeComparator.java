package comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o1.getAge() - o2.getAge());

    }
}
