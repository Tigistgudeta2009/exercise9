package pl.vistula.exercise9;

public class Account  extends Exception{
 Account(String message){
     super(message);
 }


    private int accountNumber;
     private String owner;
    private double balance;

    public Account(  String owner,  int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {this.owner = owner;}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {this.balance=balance;}



    }












