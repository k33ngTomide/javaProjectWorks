package Exercises.Account;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id = 1111;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;

    }
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public boolean withdrawal(double amount){

        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount){
        balance += amount;
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

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return this.id + " "+ this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

}
