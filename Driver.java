package Test1;
import java.text.DecimalFormat;

public class Driver
{
        /**
         * Drivers and Documentation
         * The way we use to test the classes and methods
         * Classes: BankAccount and SavingsAccount
         */


        public static void main(String[] args)
        {
            DecimalFormat df = new DecimalFormat("###.##"); // decimal placing

            BankAccount bank = new BankAccount(1000, 2);// making an objection from the BankAccount class, argument for constructor

            bank.deposit(100);   // bank object calls the void function
            System.out.println("Bank Account Balance: $" + df.format(bank.balance));

            bank.withdraw(100);
            System.out.println("Bank Account Balance: $" + df.format(bank.balance));

            bank.withdraw(2000); // should produce System message

            bank.withdraw(100);
            bank.withdraw(100);
            bank.withdraw(100);
            bank.withdraw(100);
            bank.withdraw(100);

            System.out.println("Bank Account Balance: $" + df.format(bank.balance));

            bank.interest();
            System.out.println("Bank Account Balance: $" + df.format(bank.balance));  // should have updated amount after interest added

            bank.monthlycharges();
            System.out.println("Bank Account Balance: $" + df.format(bank.balance));  // should have updated amount after charges deducted

            System.out.println("----------------------------------");


            // SAVINGS ACCOUNT TESTS
            SavingAccount saving = new SavingAccount(1000, 10);

            saving.deposit(100);   // bank object calls the void function
            System.out.println("Savings Account Balance: $" + df.format(saving.balance));
            System.out.println("----------------------------------");
            saving.withdraw(100);
            System.out.println("Savings Account Balance: $" + df.format(saving.balance));
            System.out.println("----------------------------------");
            saving.withdraw(2000); // should produce System message
            System.out.println("----------------------------------");
            saving.withdraw(100);
            saving.withdraw(100);
            saving.withdraw(100);
            saving.withdraw(100);
            saving.withdraw(100);
            saving.monthlycharges();
            System.out.println("Savings Account Balance: $" + df.format(saving.balance));  // should have updated amount after charges deducted
        }
    }