public class Product {
    private final String id;
    private final String name;
    private  int quantity;
    private final double price;
    private final String description;

    public Product(String id, String name, int quantity, double price, String description) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public synchronized void updateQuantity(int quantity) {
        this.quantity += quantity;
    }

    public synchronized boolean isAvailable(int quantity) {
        return this.quantity >= quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
