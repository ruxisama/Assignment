package assignment;

public class Wine extends Product {

    protected double volume;
    private static final int WINE_TAX = 10;

    public Wine(String productName, String barCode, double volume, double startPrice) {
        super(productName, barCode, startPrice);
        this.volume = volume;

    }

   @Override

    public double sellPrice() {

        return super.sellPrice() + super.sellPrice() * WINE_TAX / 100;



    }

   @Override

    public String toString() {

        return super.toString() + ", volume " + volume ;

    
    }
}
