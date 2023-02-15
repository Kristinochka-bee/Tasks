package comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Car implements Comparable<Car> {
    private String name;
    private int number;

    private int age;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }


    @Override
    public int compareTo(Car another) {
        if (this.name == another.name){
            return 0;
        }else if (this.number < another.number){
            return -1;
        }else return 1;
    }
}
