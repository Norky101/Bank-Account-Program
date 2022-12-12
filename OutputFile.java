package Test1;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class OutputFile
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("###.##");
        try
        {
            File file = new File("output.txt");

            if (!file.exists()) // if file doesn't exist
            {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println( "BANK ACCOUNT TESTS:");
            pw.println();
            // INFO FOR OUTPUT
            BankAccount bank = new BankAccount(1000, 2);// making an objection from the BankAccount class, argument for constructor

            bank.deposit(100);   // bank object calls the void function
            pw.println("Bank Account Balance: $" + df.format(bank.balance) );
            pw.println("----------------------------------");

            bank.withdraw(100);
            pw.println("Bank Account Balance: $" + df.format(bank.balance) );
            pw.println("----------------------------------");

            bank.withdraw(2000); // should produce System message
            pw.println("----------------------------------");

            bank.deposit(100);
            pw.println("Bank Account Balance: $" + df.format(bank.balance) );
            pw.println("----------------------------------");

            bank.interest();
            pw.println("Bank Account Balance: $" + df.format(bank.balance) );  // should have updated amount after interest added
            pw.println("----------------------------------");

            bank.monthlycharges();
            pw.println("Bank Account Balance: $" + df.format(bank.balance) );  // should have updated amount after charges deducted

            pw.println();
            pw.println("--------------------------------------------------------------------------");
            pw.println();

            // SAVINGS ACCOUNT TESTS
            pw.println( "SAVINGS ACCOUNT TESTS:");
            pw.println();

            SavingAccount saving = new SavingAccount(1000, 10);

            saving.deposit(100);   // bank object calls the void function
            pw.println("Savings Account Balance: $" + df.format(saving.balance) );
            pw.println("----------------------------------");

            saving.withdraw(100);
            pw.println("Savings Account Balance: $" + df.format(saving.balance));
            pw.println("----------------------------------");

            saving.withdraw(2000); // should produce System message
            pw.println("----------------------------------");

            saving.withdraw(100);
            saving.withdraw(100);
            saving.withdraw(100);
            saving.withdraw(100);
            saving.withdraw(100);
            saving.monthlycharges();


            pw.println();
            pw.println("----------------------------------");
            pw.println();
            pw.println("-------END OF TESTS-------");

            pw.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred. Failed to write to file");
            e.printStackTrace();
        }
    }
}

