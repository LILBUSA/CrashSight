package com.CrashSight.data;

public abstract class Date {
    private int month;
    private int year;

    protected Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}