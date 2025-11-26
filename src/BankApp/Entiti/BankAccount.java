package BankApp.Entiti;

import java.util.ArrayList;

public class BankAccount {
    private Person person;
    private String cardNumber;
    double balance;
    ArrayList<BankOperations> personalOperations = new ArrayList<>();

    public ArrayList<BankOperations> getPersonalOperations() {
        return personalOperations;
    }

    public void setPersonalOperations(ArrayList<BankOperations> personalOperations) {
        this.personalOperations = personalOperations;
    }

    public BankAccount(String cardNumber) {
        this.cardNumber = cardNumber;
        balance = 0;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
