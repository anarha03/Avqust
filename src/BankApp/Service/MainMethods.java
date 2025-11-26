package BankApp.Service;

import BankApp.Database.Database;
import BankApp.Entiti.BankAccount;
import BankApp.Entiti.Person;

import java.util.Scanner;

public class MainMethods {
    PersonService personService = new PersonService();
    AccountService accountService = new AccountService();
    OperationService operationService = new OperationService();
    Scanner sc = new Scanner(System.in);

    public void fullCode() {
        while (true) {
            System.out.println("=== BANKING SYSTEM ===");
            System.out.println("1. Bankda Yeni user yaratmaq\n" +
                    "2. User kimi daxil ol\n" +
                    "3. Çıxış\n" +
                    "Seçiminizi daxil edin:");
            int secim = sc.nextInt();
            switch (secim) {
                case 1: {
                    personService.addNewPerson();
                    break;
                }
                case 2: {
                    if (Database.persons.isEmpty()) {
                        System.out.println("Heleki bankda hec bir istifadecinin qeydiyyati yoxdur.");
                    } else {
                        userMethod();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Sagolun");
                    return;
                }
                default: {
                    System.out.println("Seciminiz yanlisdir");
                }
            }
        }
    }

    public void userMethod() {
        System.out.println("Username daxil edin:");

        String username = sc.next();
        for (Person person : Database.persons) {
            if (username.equals(person.getUsername())) {
                while (true) {
                    System.out.println("Sifreni daxil edin. Eger sifreni bilmirsinizse, cixis ucun 0 daxil edin:");
                    String password = sc.next();
                    if (password.equals(person.getPassword())) {
                        userSystem(person.getBankAccount());return;
                    } else if (password.equals("0")) {
                        return;
                    }
                }
            }
        }
    }

    public void userSystem(BankAccount bankAccount) {
        while (true) {
            System.out.println(String.format("=== %s's ACCOUNT ===", bankAccount.getPerson().getFullName()));
            System.out.println("1. Balansi gostermek\n" +
                    "2. Pul elave etmek\n" + "3. Pul cixarmaq\n" + "4. Emeliyyat tarixcesini gostermek\n" +
                    "5. Çıxış\n" +
                    "Seçiminizi daxil edin:");
            int secim = sc.nextInt();
            switch (secim) {
                case 1: {
                    accountService.showBalance(bankAccount);
                    break;
                }
                case 2: {
                    operationService.increaseBalance(bankAccount);
                    break;
                }
                case 3: {
                    operationService.withdrawCash(bankAccount);
                    break;
                }
                case 4: {
                    accountService.showHistory(bankAccount);
                    break;
                }
                case 5: {
                    System.out.println("Sagolun");
                    return;
                }
                default: {
                    System.out.println("Seciminiz yanlisdir");
                }
            }
        }
    }
}
