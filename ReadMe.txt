README FILE

Author: Noah Pilkington


INSTRUCTIONS FOR USE:

1. Open all files (BankAccount, SavingAccount, OutputFile, Driver, and UserInput.)
2. To have control of which methods to run and test you can use the UserInput file. Follow the on-screen commands accordingly.
3. If you want to test whether the program outputs to a file correctly run the OutputFile function (See below for further detail.)
4. If you want to test the program and want to see the result output on an IDE or terminal, run the Driver file.

All .java files are stored in Noah Pilkington COP2800 Final Project / src/ Test1


FILES INCLUDED:

1. BankAccount.java
- Class that holds methods including ->
Constructor -> Initializes the class object with a balance and annual interest amount.
Deposits -> Takes in an amount and adds it to balance.
Withdraw -> Takes in an amount and deducts it from balance.
Service Fee -> 1$ is deducted from the balance for every withdrawal over 4.
Interest calculator -> Calculates the monthly interest based off the constructor argument annual interest value.
ActiveAccount -> This method is used tp check whether the account is active or not.

2. SavingAccount.java
- Creates a subclass of BankAccount through using the Extend keyword.
- Checks if the users account is active or not.
- Whether the account is active or not determines whether certain methods will be run.
- Methods included: Withdraw, Deposit, Monthly service charges.

3. Driver.java
- Used to test the program with predetermined inputs.
- This file can be run as long as BankAccount and SavingAccount class is active/present.

4. UserInput.java
- Used as interactive way to test both classes and methods through using a menu feature.
- This file can be run as long as BankAccount and SavingAccount class is active/present.

5. OutputFile.java
- Runs the Driver file and saves the results to a .txt file called 'output.txt'
- See jpg image of output.txt file in submission.
