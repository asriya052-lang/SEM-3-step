package system_design.assigment_problems;

public class Product {

    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException(
                    "Product price cannot be negative."
            );
        }

        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}