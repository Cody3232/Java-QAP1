// The Date class represents a calender date that shows the day/month/year
// create private instance showing this (using ranges identified in QAP outline)
public class Date {
    private int day;
    private int month;
    private int year;

// Initializr a date object (with day, month, and year) using a constructor.
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

// Use getter method for the day/month/year
    public int getDay () {
        return day;
    }

    public int getMonth () {
        return month;
    } 

    public int getYear () {
        return year;
    }

// Use setter method for day/month.year
    public void setDay (int day) {
        this.day = day;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public void setYear (int year) {
        this.year = year;
    }

// Method which will produce the whole date
    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

// Return the date as string formatted within the QAP outline
    @Override
    public String toString () {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}