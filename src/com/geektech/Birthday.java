package com.geektech;

public class Birthday {
    private String month;
    private int day;
    private int year;

    public Birthday(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}
