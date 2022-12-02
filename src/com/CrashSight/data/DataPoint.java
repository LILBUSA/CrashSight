package com.CrashSight.data;

public class DataPoint extends Date {
    public double data;

    public DataPoint(int m, int y, double d) {
        super(m, y);
        data = d;
    }

    public void printDataSet() {
        System.out.println(getMonth() + "/" + getYear() + ": " + data);
    }

}