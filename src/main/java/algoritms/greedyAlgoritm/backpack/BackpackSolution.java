package algoritms.greedyAlgoritm.backpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


    public class BackpackSolution {
        private Double maxWeight;
        private List<Item> items;

        public BackpackSolution(Double maxWeight, List<Item> items) {
            this.maxWeight = maxWeight;
            this.items = items;
            this.items.sort(Comparator.comparing(Item::getCoefOfEfficiency).reversed());
        }

        public ArrayList<Item> getSolution(){
            Double weight = 0.0;
            ArrayList<Item> solution = new ArrayList<>();
            for(Item item : items){
                if(maxWeight >= weight + item.getWeight()) {
                    solution.add(item);
                    weight += item.getWeight();
                }
            }
            return solution;
        }
    }
