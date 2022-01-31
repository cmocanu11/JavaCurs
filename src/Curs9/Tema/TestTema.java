package Curs9.Tema;

import java.util.Scanner;

public class TestTema {

    public static void main(String[] args) throws InsufficientFundException {

        Customer customer1 = new Customer("Cosmin","Bucuresti","cosmin@test.local");
        SavingsAccount customer1SavingsAccount = new SavingsAccount(123,300.0,customer1);

        System.out.println("Hello " + customer1.getName() + "!. Your balance is "+customer1SavingsAccount.balance);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount to withdraw");
        customer1SavingsAccount.withdraw(scan.nextInt());

    }

}
