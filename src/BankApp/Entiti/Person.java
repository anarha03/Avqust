package BankApp.Entiti;

public class Person {
    private String fullName;
    private String username;
    private String password;
    private BankAccount bankAccount;

    public Person(String fullName, String username, String password, BankAccount bankAccount) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.bankAccount = bankAccount;
    }

    public Person(String fullName, String username, String password) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
