package assignment;

public abstract class Product {

    protected String productName;
    protected String barCode;
    protected double startPrice;
    private static final int TVA = 20;

    public Product(String productName, String barCode, double startPrice) {
        this.productName = productName;
        this.barCode = barCode;
        this.startPrice = startPrice;

    }
     @Override

    public String toString() {

        return "Product: " + productName + ", barCode " + barCode ;

    }

    public String getproductName() {
        return productName;

    }

    public String getbarCode() {
        return barCode;
    }

    public double sellPrice() {
        double sellPrice = ((startPrice * TVA / 100) + startPrice);
        return sellPrice;

    }

}
