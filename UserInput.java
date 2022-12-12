package Test1;
import java.text.DecimalFormat;

import java.awt.*;
import java.util.Scanner;
/**
 * User input Drivers
 * The way we use to test the classes and methods with user input.
 */
public class UserInput
{
    public static void main(String[] args)
    {

        double balance, moneyout, annual_rate , moneyin;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What would you like your balance to be?"); //arguement for object
        balance = keyboard.nextDouble();

        System.out.println("What would you like your annual interest rate to be?"); //arguement for object
        annual_rate = keyboard.nextDouble();

        // creating new object to work with
        BankAccount account = new BankAccount(balance, annual_rate);  //Saving Account object with arguements

        Scanner choice = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###.##");

        //set choiceentry to -1, this will make it to enter while loop
        int choiceentry = -1;

        do
        {
            System.out.println("Pick One: \n 1: to deposit money \n 2: to withdraw money \n 3: Calculate interest\n 4: Pay service fees\n 5: See balance \n 6. Account active status\n 7: End program"+ "\n");

            if(choice.hasNextInt())
                choiceentry = choice.nextInt();


            switch (choiceentry)
            {
                case 1 -> {   // deposit
                    System.out.println("How much would you like to deposit?"+ "\n");
                    moneyin = keyboard.nextDouble();
                    account.deposit(moneyin);
                }
                case 2 -> {     // withdraw
                    System.out.println("How much money would you like to withdraw? "+ "\n"); //Withdraw from the account
                    moneyout = keyboard.nextDouble();
                    account.withdraw(moneyout);
                }
                case 3 -> {     // interest

                    account.interest();
                    System.out.println("Your interest has been added to balance"+ "\n");

                }
                case 4 -> {     // service fee
                    account.monthlycharges();
                    System.out.println("Your service fees have been paid" + "\n");
                }
                case 5 ->    // See balance
                        System.out.println("Your current balance is: $" + account.balance + "\n");

                case 6 -> {    // Account active
                    if(account.activeAccount(balance)) // true
                    {
                        System.out.println("Account is active\n");
                    }
                    else // false
                    {
                        System.out.println("Account is not active\n");
                    }
                }
                case 7 -> {    // Account active
                    System.out.println("Thank you for your being a customer! \n Exiting program... \n");
                    System.exit(0);
                }
                default ->   // invalid key entered
                        System.out.println("This is not a valid Menu Option! Please Select Another\n Choice must be a value between 1 and 6.\n");
            }
        } while (choiceentry != 7);
    }
}
