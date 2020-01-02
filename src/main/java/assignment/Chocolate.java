package assignment;

public class Chocolate extends Product {

    protected double weight;

    public Chocolate(String productName, String barCode, double weight, double startPrice) {
        super(productName, barCode, startPrice);
        this.weight = weight;

    }
    @Override

    public String toString() {

        return super.toString() + ", weight " + weight  ;

    }

   

}
