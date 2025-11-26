package BankApp.Service;

import BankApp.Database.Database;
import BankApp.Entiti.BankAccount;
import BankApp.Entiti.Person;

import java.util.Scanner;

public class PersonService {
    Scanner sc = new Scanner(System.in);

    public void addNewPerson() {
        System.out.println("Elaveetdiyiniz istifadecinin ad soyadini daxil edin:");
        String fullName = sc.nextLine();

        while (true) {
            boolean sameUser = true;
            System.out.println("Username:");
            String username = sc.nextLine();
            if (!Database.persons.isEmpty()) {
                for (Person person : Database.persons) {
                    if (username.equals(person.getUsername())) {
                        System.out.println(username + " adli istifadeci sistemde movcuddur. Zehmet olmas, basqa username daxil edin:");
                        sameUser = false;
                    }
                }
            }
            if (sameUser) {
                System.out.println("Password:");
                String password = sc.nextLine();
                System.out.println("Bank account card number:");
                String cardNumber = sc.nextLine();
                BankAccount bankAccount = new BankAccount(cardNumber);
                Person person1 = new Person(fullName, username, password, bankAccount);
                bankAccount.setPerson(person1);
                Database.persons.add(person1);
                Database.bankAccounts.add(bankAccount);
                break;
            }
        }
    }
}

