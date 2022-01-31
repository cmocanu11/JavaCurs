package Curs9.Tema;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountNumber, double balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    void withdraw(int sum) throws InsufficientFundException {
        if(sum > balance){
            System.out.println("The amount you entered is greater than the available balance: "+ balance +
                    "\nThank you for using the ATM!");
            throw new InsufficientFundException("Insufficient funds for transaction");
        } else{
            balance-=sum;
            System.out.println("Your new balance is: "+ balance +
                    "\nPlease pick your money!" +
                    "\nThank you for using the ATM!");
        }
    }
}
