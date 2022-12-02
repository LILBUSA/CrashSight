package com.CrashSight.data;
import java.util.ArrayList;

public class DataSet {
    public ArrayList<DataPoint> points = new ArrayList<>();
    public String set_name;

    public DataSet(String name) {
        set_name = name;
    }

    public void addPoint(DataPoint point) {
        points.add(point);
    }
}
