package pl.vistula.exercise9;

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE:");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occur:" + e);
        }
    }
    static void checkAge(int age)throws AgeException{
        if (age < 18) {

            throw  new AgeException("\n"+ "you must be more than 18 to sign up");

        }
        else {
            System.out.println(" You are now signed up");
        }
    }
}
