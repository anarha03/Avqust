package BankApp.Entiti;

import java.time.LocalTime;

public class BankOperations {
    private static int counter = 0; // yalnız sayğac
    private int id;    double amount;
    String operation;
    LocalTime localTime;

    @Override
    public String toString() {
        return "Operation ID: "+id+". "+operation;
    }

    public BankOperations(String operation) {
        this.operation = operation;
        this.id=++counter;
    }

}
