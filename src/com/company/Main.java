package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        TempConversion tempConversion = new TempConversion();
        tempConversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempConversion.setBounds(400, 100, 350, 300);
        tempConversion.getContentPane().setBackground(new Color(237, 125, 49));
        tempConversion.setResizable(false);
        tempConversion.setVisible(true);

    }

}
