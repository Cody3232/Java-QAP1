// The TestAccount class is for testing the functionality of the account class.
public class TestAccount {

    public static void main(String[] args) {
        // Create two accounts with initial balances
        // Shows ID, Name, and balance (in that order)
        Account acc1 = new Account("001", "Sarah", 5000);
        Account acc2 = new Account("002", "Cody", 4000);

        // This will display the initial balancves, and makes it into a string (toString())
        System.out.println("Initial Account Balances:");
        System.out.println("Account 1: " +  acc1);

        // Transfering funds from one account to another
        System.out.println("\nTransferring $1000 from Account 1 to Account 2...");
        acc1.transferTo(acc2, 1000); 

        // This will display the updated balances in accounts after the funds were trasnfered.
        System.out.println("\nAccount balances After Trasnfer:");
        System.out.println ("Account 1: " + acc1);
        System.out.println ("Account 2: " + acc2);
    }
}