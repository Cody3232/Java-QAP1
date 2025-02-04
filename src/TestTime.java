// The TestTime class is for testing the functionality of the Time class.
public class TestTime {

    public static void main(String[] args) {
// Create two Time objects with initial times
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

// Display initial times before any changes
        System.out.println("Initial Times:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

// Advance t1 by 1 second and go back 1 second for t2
        t1.nextSecond();
        t2.previousSecond();

// Display the times after they were changed
        System.out.println("\nModified Times:");
        System.out.println("Time 1 (Next second): " + t1);
        System.out.println("Time 2 (Previous second): " + t2);
    }
}
