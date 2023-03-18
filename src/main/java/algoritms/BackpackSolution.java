package algoritms;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

    //Задача: максимальная выгода, второстепенно заполняемость
    //зал для конференций работает с 9:00 до 17:00
    //заявки с 9:00 до 13:00 стоят 1 единицу
    //заявки с 13:00 до 17:00 стоят 2 единицы
    //
    //заявки на пересечении в большую сторону 9:00 стоят 1 ед
    //например с 11 до 14 стоит 1 ед
    //заявки на пересечении в большую сторону 17:00 стоят 2 ед
    //например с 12 до 16 стоит 2 ед


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
