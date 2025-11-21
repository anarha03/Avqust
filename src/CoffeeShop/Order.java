package CoffeeShop;

import java.util.ArrayList;

public class Order {
    int number;
    int table;
    double totalPrice;
    int calory;
    ArrayList<Coffee> coffees = new ArrayList<>();
    ArrayList<Sweet> sweets = new ArrayList<>();


    public Order(int number,int table, double totalPrice,int calory) {
        this.number=number;
        this.table = table;
        this.totalPrice = totalPrice;
        this.calory=calory;
    }
}
