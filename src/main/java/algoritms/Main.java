package algoritms;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BackpackSolution backpackSolution = new BackpackSolution(
                5.0,
                Arrays.asList(
                        new Item(1.0, 1.0),
                        new Item( 1.0, 3.0),
                        new Item(2.0, 4.0)
                )
        );
        backpackSolution.getSolution().forEach(
                item -> System.out.println(item.getPrice() + ":" + item.getWeight())
        );
    }
}