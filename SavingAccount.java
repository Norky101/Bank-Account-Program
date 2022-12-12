package Test1;
import java.text.DecimalFormat;
    // SAVINGS ACCOUNT

    /**
     * Savings account subclass needs to be active for it to be able to call methods.
     * Active: If balance is > 25.
     * Inactive: If balance < 25.
     */
    public class SavingAccount extends BankAccount // subclass of super class
    {
        boolean active;  // true or false used to determine if account is active.


        public SavingAccount(double balance, double annualInterestRate) // constructor
/**
 * Constructor for savingAccount class.
 * Checks if the status of the account is active.
 */

        {
            super(balance, annualInterestRate);  // arguement for SavingsAccount class

            if (balance < 25) // active account condition
            {
                active = false;
            } else {
                active = true;
            }
        }



        @Override
        public void withdraw(double moneyout)
/**
 * We can only withdraw fund if our account is active. Active -> withdraw money. Inactive -> notification msg.
 */
        {
            if (active) // active is true
            {
                super.withdraw(moneyout);  // calls the withdraw method with moneyout arguement
            } else {
                System.out.println("Account is inactive. Fund account.");
            }
        }


        @Override
        public void deposit(double moneyin)
/**
 * We can only deposit into balance if our account is active or if deposited is > 25, this
 * will be enough to make our account active.
 */
        {
            double tot = balance + moneyin;  // check if potential deposit + current balance will qualify to active account

            if (active || tot > 25) // 'or' statement: -> active = add funds, funds > 25 -> account active
            {
                super.deposit(moneyin); // adds deposit to balance via deposit method
                active = true;
                depositfreq += 1;
            } else {
                System.out.println("Account is inactive. Fund account.");
            }
        }
    }

//    @Override
//    public void monthlycharges ()
///**
// * If withdrawals is greater than 4, we charge 1$ for every withdrawal over.
// * Store that value in servicecharge variable which will be deducted from balance.
// * Then checks if the active condition is valid or not.
// */
//    {
//        if (withdrawfreq > 4)
//        {
//            servicecharge += (withdrawfreq - 4); // calcs the difference
//            System.out.println("Service fee: $" + servicecharge + "\n");
//        }
//
//        if (balance < 25) // active account condition
//        {
//            active = false;
//        }
//
//    }
//}

