package java.lab6;

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product(999.99);
        Priceable service = new Service(50.0);

        System.out.println(product.getPrice());
        System.out.println(service.getPrice());
    }
}
