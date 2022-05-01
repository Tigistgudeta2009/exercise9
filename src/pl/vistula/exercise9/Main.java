package pl.vistula.exercise9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Account a = new Account("tigi" , 12345 ,00000);
        System.out.println(a.getAccountNumber());
        System.out.println(a.getBalance());
        System.out.println(a.getOwner());

        a.setAccountNumber(12345);
        a.setBalance(00000);
        a.setOwner("");


        Scanner scan = new Scanner(System.in);
        System.out.println("YOUR BALANCE:");
        double balance = scan.nextInt();

        try {
            NotEnoughMoney(balance);

        } catch (Exception e) {
            System.out.println(" HAVE  NO ENOUGH MONEY" + e);
        }

     finally

    {
        System.out.println(" Deposit some money");
    }

}

static void NotEnoughMoney(double balance)throws Account{
        if (balance<=3000){

           throw  new Account("\n"+ "You must have to put some money insufficient balance");

        }
        else {
            System.out.println("transaction  is done ");
        }
    }
}

