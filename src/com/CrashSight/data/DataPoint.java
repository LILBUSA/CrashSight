package com.CrashSight.data;

public class DataPoint extends Date {
    public double data;

    public DataPoint(int q, int y, double d) {
        super(q, y);
        data = d;
    }

    public String printDataSet() {
        return  getYear() + "/Q" + getQuarter() + ": " + data;
    }

}