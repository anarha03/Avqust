package CoffeeShop;

public class Coffee {
    static int id;
    String name;
    double price;
    String description;

    public Coffee(String name, double price, String description) {
        id++;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
