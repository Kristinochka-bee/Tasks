package algoritms;
public class Item {
    private Double price;
    private Double weight;

    public Item(Double price, Double weight) {
        this.price = price;
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getCoefOfEfficiency(){
        return price / weight;
    }
}
