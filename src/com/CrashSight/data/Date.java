package com.CrashSight.data;

public abstract class Date {
    private int quarter;
    private int year;

    protected Date(int quarter, int year) {
        this.quarter = quarter;
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public int getYear() {
        return year;
    }
}