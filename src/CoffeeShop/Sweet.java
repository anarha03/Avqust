package CoffeeShop;

public class Sweet {
    static int id;
    String name;
    double price;
    int calory;
    String description;

    public Sweet(String name, double price, int calory,String description) {
        id++;
        this.name = name;
        this.price = price;
        this.calory=calory;
        this.description = description;
    }
}
