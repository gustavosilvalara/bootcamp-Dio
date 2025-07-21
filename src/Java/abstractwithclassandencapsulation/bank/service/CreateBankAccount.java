package Java.abstractwithclassandencapsulation.bank.service;

public abstract class CreateBankAccount {
    private final String name;
    private final double specialCheck;
    private double balance;

    public CreateBankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        specialCheck = balance <= 500 ? 50.00 : balance * 0.50;
    }

    public double getSpecialCheck() {
        return specialCheck;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

