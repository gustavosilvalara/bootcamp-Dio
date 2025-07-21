package Java.abstractwithclassandencapsulation.bank.service;

import Java.abstractwithclassandencapsulation.bank.metods.Metods;

import java.text.DecimalFormat;

public class BankAccount extends CreateBankAccount implements Metods {

    DecimalFormat df = new DecimalFormat("#0.00");

    protected double usingSpecialCheck;

    public BankAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public String statementBalance() {
        return "Statement balance = " + df.format(getBalance());
    }

    @Override
    public String statementEspecialCheck() {
        if (getUsingSpecialCheck() != 0) {
            return "A 20% fee will be charged on the special check used = " + df.format(getSpecialCheck()) + " used " + getUsingSpecialCheck();
        }
        return "Statement especial check = " + df.format(getSpecialCheck() + getBalance()) + " limit used " + getUsingSpecialCheck();
    }

    @Override
    public String depositMoney(double deposit) {
        if (getUsingSpecialCheck() != 0) {
            setBalance(getBalance() + ((getUsingSpecialCheck() + (getUsingSpecialCheck() * 0.20)) + deposit));
            return "A 20% fee will be charged on the special check used, amount: R$" + df.format(Math.abs(getUsingSpecialCheck())) + " completed ";
        } else {
            setBalance(getBalance() + deposit);
            return "Deposit of " + df.format(deposit) + " completed.";
        }
    }

    @Override
    public String withdrawMoney(double withdraw) {
        if (getBalance() + getSpecialCheck() < withdraw) {
            return "Error: insufficient limit";
        } else if (getBalance() >= withdraw) {
            setBalance(getBalance() - withdraw);
            return "Withdrawal of " + df.format(withdraw) + " completed ";
        } else
            setBalance(getBalance() - withdraw);
            setUsingSpecialCheck(Math.abs(getBalance()));
            setBalance(0);
        return "Withdrawal of " + df.format(withdraw) + " the special check will be used in the amount of " + df.format(getUsingSpecialCheck()) + " completed ";
    }

    @Override
    public String payBill(double valueBill) {
        if (getBalance() + getSpecialCheck() < valueBill) {
            return "Error: insufficient limit";
        } else if (getBalance() >= valueBill) {
            setBalance(getBalance() - valueBill);
            return "The bill was paid of " + df.format(valueBill) + " completed ";
        } else {
            setUsingSpecialCheck(getBalance() - valueBill);
            setUsingSpecialCheck(Math.abs(getBalance()));
            setBalance(0);
            return "The bill was paid of " + df.format(valueBill) + ", the special check will be used in the amount of " + df.format(Math.abs(getUsingSpecialCheck())) + " completed ";
        }
    }

    @Override
    public String checkingSpecialCheck() {
        if (usingSpecialCheck != 0) {
            return "The special check is being used: " + df.format(Math.abs(getUsingSpecialCheck())) + " Tax of: " + df.format(Math.abs(getUsingSpecialCheck() * 0.20));
        } else {
            return "The special check is not being used " + df.format(getUsingSpecialCheck());
        }
    }

    public double getUsingSpecialCheck() {
        return usingSpecialCheck;
    }

    public void setUsingSpecialCheck(double usingSpecialCheck) {
        this.usingSpecialCheck = usingSpecialCheck;
    }
}
