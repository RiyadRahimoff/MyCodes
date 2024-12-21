package shoppingcartsys;

public class Product {
    private static int nextId = 1;
    private int id;
    private String name;
    private double price;

    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product: " +
                "ID=" + id +
                ", Name:" + name +
                ", Price:" + price;
    }
}
