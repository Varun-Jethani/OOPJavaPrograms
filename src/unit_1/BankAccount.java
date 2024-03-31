package unit_1;
class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountName, int balance) {
        super(accountName,balance);
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountName, int balance) {
        super(accountName, balance);
    }
}
public class BankAccount {
    protected int balance;
    String accountName;

    public BankAccount(String accountName, int balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public void withdraw(int amount){
        if (this.balance>=amount) {
            this.balance -= amount;
            System.out.println("Amount Withdrawn is "+amount);
            System.out.println("New Balance is "+this.balance);
        } else {
            System.out.println("Not Enough Balance, your Balance is "+this.balance);
        }
    }
    public void deposit(int amount){
        this.balance += amount;
        System.out.println(amount+"deposited to your account\n New Balance is:"+this.balance);
    }

}
