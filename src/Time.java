// The time class will present the time
public class Time {
// Private instances variables
    private int hour;
    private int minute;
    private int second;

// Constructor to initialize the Time object with hour, minute, and second values.
public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}

// Getter method: Returns the hour value
public int getHour() {
    return hour;
}

// Getter method: Returns the minute value
public int getMinute() {
    return minute;
}

// Getter method: Returns the second value
public int getSecond() {
    return second;
}

// Setter method: Sets the hour value
public void setHour(int hour) {
    this.hour = hour;
}

// Setter method: Sets the minute value
public void setMinute(int minute) {
    this.minute = minute;
}

// Setter method: Sets the second value
public void setSecond(int second) {
    this.second = second;
}

// Method to set the time with all three values: hour, minute, and second
public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}

// Method to convert the time into a string format "hh:mm:ss" with leading zeros if needed
@Override
public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
}

// Method to advance the time by one second and return the updated Time instance, Reset hour if it exceeds 23
// Returns updated instance
public Time nextSecond() {
    second++;
    if (second > 59) {
        second = 0;
        minute++;
        if (minute > 59) {
            minute = 0;
            hour++;
            if (hour > 23) {
                hour = 0; // Reset hour if it exceeds 23
            }
        }
    }
    return this;
}

// Method to go back one second and return the updated Time instance, also resets hour if it goes below 0
// Also returns updated instance
public Time previousSecond() {
    second--;
    if (second < 0) {
        second = 59;
        minute--;
        if (minute < 0) {
            minute = 59;
            hour--;
            if (hour < 0) {
                hour = 23; 
            }
        }
    }
    return this; 
}
}