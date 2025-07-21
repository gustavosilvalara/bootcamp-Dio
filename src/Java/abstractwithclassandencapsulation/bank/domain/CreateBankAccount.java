package Java.abstractwithclassandencapsulation.bank.domain;

public sealed abstract class CreateBankAccount permits BankAccount {
    private final String name;
    private final double specialCheck;
    private double balance;

    public CreateBankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        specialCheck = balance <= 500 ? 50.00 : balance * 0.50;
    }

    protected double getSpecialCheck() {
        return specialCheck;
    }

    protected String getName() {
        return name;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

}

