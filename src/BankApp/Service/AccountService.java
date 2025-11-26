package BankApp.Service;

import BankApp.Entiti.BankAccount;
import BankApp.Entiti.BankOperations;

public class AccountService {
    public void showBalance(BankAccount bankAccount) {
        System.out.println(String.format("Sizin %s nomreli hesabinizda olan cari balans: %s", bankAccount.getCardNumber(), bankAccount.getBalance()));
    }
    public void showHistory(BankAccount bankAccount){
        System.out.println(String.format("Sizin %s nomreli hesabinizda olan cari balans: %s", bankAccount.getCardNumber(), bankAccount.getBalance()));
        System.out.println("Hesabinizdaki emeliyyat tarixcesi:");
        for (BankOperations bankOperations:bankAccount.getPersonalOperations()){
            System.out.println(bankOperations);
        }
    }
}
