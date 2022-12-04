package com.CrashSight.data;
import java.util.ArrayList;

public class DataSet {
    public ArrayList<DataPoint> points;
    public String set_name;

    public DataSet(String name) {
        set_name = name;
        points = new ArrayList<>();
    }

    public DataSet(String name, ArrayList<DataPoint> pointsList) {
        set_name = name;
        points = pointsList;
    }

    public void addPoint(DataPoint point) {
        points.add(point);
    }

    public void printPoints() {
        System.out.println(set_name);
        for (DataPoint p:points) {
            System.out.println(p.printDataSet());
        }
    }
}
