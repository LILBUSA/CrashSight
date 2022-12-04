package com.CrashSight.main;

import javax.swing.*;
import com.CrashSight.data.*;

public class CrashSightGUI {
    private JPanel CrashSight;
    private JLabel UserLabel;
    private JLabel TimeLabel;
    private JComboBox UserBox;
    private JComboBox RangeBox1;
    private JComboBox RangeBox2;
    private JPanel RangePanel1;
    private JPanel RangePanel2;
    private JPanel TimePanel;
    private JPanel UserPanel;
    private JPanel UserBoxPanel;
    private JPanel LogoPanel;
    private JLabel Logo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CrashSightGUI");
        frame.setContentPane(new CrashSightGUI().CrashSight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
