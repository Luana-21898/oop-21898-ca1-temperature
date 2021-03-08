package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TempConversion extends JFrame {

    private JLabel titleLabel;
    private JRadioButton celsiusJRadioButton;
    private JRadioButton fahrenheitJRadioButton;
    private ButtonGroup buttonGroup;
    private JTextField inputValue;
    private JTextField convertedValue;
    private JButton convertButton;
    private JFormattedTextField onlyNumbers;

    public TempConversion() {

        super("Temperature Conversion");
        setLayout(new GridLayout(5, 0));

        titleLabel = new JLabel("Temperature Conversion");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setBackground(new Color(68, 114, 196));
        titleLabel.setForeground(Color.white);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setOpaque(true);
        add(titleLabel);

        celsiusJRadioButton = new JRadioButton("Celsius", true);
        celsiusJRadioButton.setFont(new Font("Serif", Font.BOLD, 14));
        celsiusJRadioButton.setBackground(new Color(237, 125, 49));
        celsiusJRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(celsiusJRadioButton);

        fahrenheitJRadioButton = new JRadioButton("Fahrenheit", false);
        fahrenheitJRadioButton.setFont(new Font("Serif", Font.BOLD, 14));
        fahrenheitJRadioButton.setBackground(new Color(237, 125, 49));
        fahrenheitJRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(fahrenheitJRadioButton);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(celsiusJRadioButton);
        buttonGroup.add(fahrenheitJRadioButton);

        JPanel panel = new JPanel(new GridLayout(1, 0));
        panel.add(celsiusJRadioButton);
        panel.add(fahrenheitJRadioButton);
        add(panel);

        inputValue = new JFormattedTextField("");
        inputValue.setToolTipText("Enter the number to be converted here");
        inputValue.setHorizontalAlignment(SwingConstants.CENTER);
        inputValue.setBackground(new Color(68, 114, 196));
        inputValue.setForeground(Color.white);
        inputValue.setFont(new Font("Serif", Font.BOLD, 18));
        add(inputValue);

        convertedValue = new JTextField("");
        convertedValue.setHorizontalAlignment(SwingConstants.CENTER);
        convertedValue.setToolTipText("Value converted");
        convertedValue.setBackground(new Color(68, 114, 196));
        convertedValue.setForeground(Color.white);
        convertedValue.setFont(new Font("Serif", Font.BOLD, 18));
        convertedValue.setEditable(false);
        add(convertedValue);


        convertButton = new JButton("Convert");
        add(convertButton);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    if (celsiusJRadioButton.isSelected()) {
                        Double temp = Double.parseDouble(inputValue.getText());
                        Double resultValue = temp * 1.8 + 32;
                        convertedValue.setText(resultValue + " °F");

                    } else {
                        Double temp = Double.parseDouble(inputValue.getText());
                        Double resultValue = (temp - 32) / 1.8;
                        convertedValue.setText(resultValue + " °C");


                    }

                } catch (Exception exception) {

                    JOptionPane.showMessageDialog(inputValue, "Only numbers allowed");
                }

            }

        });
    }


}

