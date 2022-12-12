package Test1;
import java.text.DecimalFormat;

/**
 * Super class that holds functions: Deposit, withdraw, servicecharge, interest.
 */
public class BankAccount
    {
        // declare class attributes
        public int withdrawfreq, depositfreq; // public so they can accessed by other classes
        public double balance, servicecharge, monthlyinterest, monthlyrate, annual_rate;
        public Boolean active, activeAccount;
        public String accountstatus;


        public BankAccount(double startamount, double rate)
        /**
         * Constructor to initialize BankAccount class with balance amount and annual interest rate.
         */
        // constructor to instialize class values
        {
            balance = startamount;
            annual_rate = rate;  //annual interest rate
            servicecharge = 0;
            depositfreq = 0;
            withdrawfreq = 0;

            active = activeAccount(balance);  // checks if account is now active or not
        }

        DecimalFormat df = new DecimalFormat("###.##"); //used for decimal place formatting
        public void deposit(double moneyin)
        /**
         * Money in is added to balance total. Deposit freq is increment.
         */
        {
            balance += moneyin;
            depositfreq += 1;
            active = activeAccount(balance);  // checks if account is now active or not
        }

        public void withdraw(double moneyout)
        /**
         * To withdraw funds the balance has to be larger than withdraw amount.
         * If not we can not withdraw amount.
         */
        {
            if (moneyout <= balance) {
                balance -= moneyout;
                withdrawfreq += 1;
            } else
                System.out.println("Not enough funds in balance to support transaction. Fund account.");

            active = activeAccount(balance);  // checks if account is now active or not
        }


        public void interest()
        /**
         * end of month monthly interest rate calculated from balance is added to balance.
         */
        {
            monthlyrate = (annual_rate / 12); // check for extended decimal places
            monthlyinterest = (balance * monthlyrate);
            System.out.println("Monthly interest: $" + df.format(monthlyinterest));
            balance = balance + monthlyinterest;

            active = activeAccount(balance);
        }

        public void monthlycharges() //monthly service charges
        /**
         * Deducts servicecharges from balance.
         * Sets servicecharge, withdrawfreq and depositfreq to 0 for reset of new month allowance.
         */
        {
            if (withdrawfreq > 4)
            {
                servicecharge += (withdrawfreq - 4); // calcs the difference
                System.out.println("Service fee:" + df.format(servicecharge));
                balance -= servicecharge;
            }
            System.out.println("No fees are due yet");

            // active account condition
            active = activeAccount(balance);    // checks if account is now active or not

            interest();
            servicecharge = 0;
            withdrawfreq = 0;
            depositfreq = 0;
        }
        public boolean activeAccount(double balance) // method to check if account is active, returns bool
        {
            if (balance < 25) // active account condition
            {
                return false;
            }
            else
            {
                return true;
            }
        }

    }

