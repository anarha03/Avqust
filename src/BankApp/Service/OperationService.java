package BankApp.Service;

import BankApp.Database.Database;
import BankApp.Entiti.BankAccount;
import BankApp.Entiti.BankOperations;

import java.time.LocalTime;
import java.util.Scanner;

public class OperationService {
    Scanner sc = new Scanner(System.in);

    public void increaseBalance(BankAccount bankAccount) {
        System.out.println("Medaxil etmek istediyiniz meblegi daxil edin:");
        double amount = sc.nextDouble();
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.printf("%s nomreli bank hesabina %s AZN medaxil edildi.", bankAccount.getCardNumber(), amount);
        System.out.println();
        BankOperations bankOperations=new BankOperations(String.format("%s nomreli bank hesabina %s AZN medaxil edildi. Cari balans: %s. Emeliyyat tarixi: %s", bankAccount.getCardNumber(), amount, bankAccount.getBalance(), LocalTime.now()));
        Database.bankOperations.add(bankOperations);
        bankAccount.getPersonalOperations().add(bankOperations);
    }

    public void withdrawCash(BankAccount bankAccount) {
        while (true) {
            System.out.println(String.format("Cari balans: %s", bankAccount.getBalance()));
            System.out.println("Cixis ucun 0 daxil edin ya da mexaric etmek istediyiniz meblegi daxil edin:");
            double amount = sc.nextDouble();
            if (amount == 0) {
                System.out.println("Cixis etdiniz.");
                return;
            } else if (bankAccount.getBalance() >= amount) {
                bankAccount.setBalance(bankAccount.getBalance() - amount);
                System.out.printf("%s nomreli bank hesabindan %s AZN mexaric edildi.", bankAccount.getCardNumber(), amount);
                System.out.println();
                BankOperations bankOperations=new BankOperations(String.format("%s nomreli bank hesabindan %s AZN mexaric edildi. Cari balans: %s. Emeliyyat tarixi: %s", bankAccount.getCardNumber(), amount, bankAccount.getBalance(),LocalTime.now()));
                Database.bankOperations.add(bankOperations);
                bankAccount.getPersonalOperations().add(bankOperations);
                break;
            } else {
                System.out.println("Balansinizda kifayet qeder mebleg yoxdur, bir daha cehd edin.");
            }
        }
    }
}
