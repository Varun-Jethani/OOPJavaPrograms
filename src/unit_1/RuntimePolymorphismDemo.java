package unit_1;

class BankAcc {
    private int accNo;
    double balance;
    private String name;
    public BankAcc(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}

class SavingAcc extends BankAcc {
    private double interest;
    public SavingAcc(String name, int accNo, double balance, double interest) {
        super(name, accNo, balance);
        this.interest = interest;
    }
    public void display() {
        super.display();
        System.out.println("Interest: " + interest);
    }

    public void withdraw(double amount) {
        if (balance - amount < 1000) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount + interest;
    }

}

class CheckingAcc extends BankAcc {
    private double serviceCharge;
    public CheckingAcc(String name, int accNo, double balance, double serviceCharge) {
        super(name, accNo, balance);
        this.serviceCharge = serviceCharge;
    }
    public void display() {
        super.display();
        System.out.println("Service Charge: " + serviceCharge);
    }

    public void withdraw(double amount) {
        if (balance - amount < 1000) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount - serviceCharge;
    }

}



public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

    }
}
