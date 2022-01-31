package Curs9.Tema;

public abstract class Account {

    private int accountNumber;
    public double balance;
    public Customer accountOwner;

    public Account (int accountNumber, double balance, Customer customer){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOwner = customer;
    }

    abstract void withdraw(int sum) throws InsufficientFundException;
}
