package practice.sber.projectone;

import java.util.Date;

public class Account {

    private static double annualInterestRate;
    private int id = 0;
    private double balance = 0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public double withdraw(int sum) {
        return balance -= sum;
    }

    public double deposit(int sum) {
        return balance += sum;
    }
}
