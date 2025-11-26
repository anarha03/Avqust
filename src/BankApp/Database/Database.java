package BankApp.Database;

import BankApp.Entiti.BankAccount;
import BankApp.Entiti.BankOperations;
import BankApp.Entiti.Person;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Person> persons = new ArrayList<>();
    public static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public static ArrayList<BankOperations> bankOperations = new ArrayList<>();
}
