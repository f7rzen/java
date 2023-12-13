package java.lab6;

public class Product implements Priceable {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() { return price; }

}
