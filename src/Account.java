// The Account class represents a bank account with an ID, a name, and a balance.
public class Account {
    // Private instance variables (should only be accessible within this class)
    private String id;      // Unique identifier for the account
    private String name;    // Name of the account holder
    private int balance;    // Account balance in whole dollars (expresed as int)

    // Constructor: Initializes an Account object with an ID and name.
    // Balance is set to 0 by default.
    public Account(String id, String name) {
        this.id = id;       
        this.name = name;   
        this.balance = 0;   
    }

    // Constructor: Initializes an Account object with an ID, name, and a given balance.
    // Assign the provided ID/Name/Balance
    public Account(String id, String name, int balance) {
        this.id = id;           
        this.name = name;       
        this.balance = balance; 
    }

    // Getter method: Returns the account ID
    public String getID() {
        return id;
    }

    // Getter method: Returns the account holder's name
    public String getName() {
        return name;
    }

    // Getter method: Returns the current balance
    public int getBalance() {
        return balance;
    }

    // Adds money to the balance and returns the updated balance.
    public int credit(int amount) {
        balance += amount;  
        return balance;     
    }

    // Withdraws money from the balance if sufficient funds are available.
    public int debit(int amount) {
        if (amount <= balance) {   // Check if the amount to withdraw is available
            balance -= amount;     // Subtract the amount from the balance
        } else {
            System.out.println("Amount exceeded balance");  // Print a warning if funds are insufficient
        }
        return balance;   // Return the updated balance (unchanged if withdrawal failed)
    }

    // Transfers money from this account to another account if there are enough funds.
    // Allows for adding and subtracting amounts
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {   // Check if this account has enough balance
            this.balance -= amount;  
            another.balance += amount;  
        } else {
            System.out.println("Amount exceeded balance");  // Prints a warning if funds aren't enough
        }
        return balance;  // Return the updated balance of this account
    }

    // Converts account details into a string format for display.
    @Override
    public String toString() {
        return "Account [id = " + id + ", name = " + name + ", balance = " + balance + "]";
    }
}
