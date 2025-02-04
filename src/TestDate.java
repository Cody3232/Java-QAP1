// This will allow testing for the date class
public class TestDate {

    public static void main(String[] args) {
// Creates a date object with the specific day/month/year
        Date date = new Date (5, 3, 2024) ;

// Prints out the statement with toString() method
        System.out.println("Formatted Date: " + date.toString());

// Set up new date for the object
        date.setDate (15, 10, 2025);

// Finally, we print the updated date using toString() again
        System.out.println("New Formatted Date: " + date.toString());
    }
}