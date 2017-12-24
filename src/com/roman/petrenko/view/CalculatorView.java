package com.roman.petrenko.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
    private JTextField textField = new JTextField(20);
    public JButton b1 = new JButton("1");
    public JButton b2 = new JButton("2");
    public JButton b3 = new JButton("3");
    public JButton b4=new JButton("4");
    public JButton b5=new JButton("5");
    public JButton b6=new JButton("6");
    public JButton b7=new JButton("7");
    public JButton b8=new JButton("8");
    public JButton b9=new JButton("9");
    public JButton b0=new JButton("0");
    public JButton bdiv=new JButton("/");
    public JButton bmul=new JButton("*");
    public JButton bsub=new JButton("-");
    public JButton badd=new JButton("+");
    public JButton bpow=new JButton("^");
    public JButton bcalc=new JButton("Calculate");
    public JButton bclr=new JButton("clr");


    public CalculatorView( ) {
        JPanel calcPanel = new JPanel();
        this.setTitle("Calculator");

        this.setSize(350,500);
        textField.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bclr.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        bpow.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        bcalc.setBounds(40,380,260,40);

        calcPanel.setBackground(Color.blue);
        calcPanel.add(textField);
        calcPanel.add(b7);
        calcPanel.add(b8);
        calcPanel.add(b9);
        calcPanel.add(bdiv);
        calcPanel.add(b4);
        calcPanel.add(b5);
        calcPanel.add(b6);
        calcPanel.add(bmul);
        calcPanel.add(b1);
        calcPanel.add(b2);
        calcPanel.add(b3);
        calcPanel.add(bsub);
        calcPanel.add(b0);
        calcPanel.add(bpow);
        calcPanel.add(badd);
        calcPanel.add(bclr);
        calcPanel.add(bcalc);

        calcPanel.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(calcPanel);
    }

    public String getNumbers() {
        return textField.getText();
    }

    public int getCalcSolution() {
        return Integer.parseInt(textField.getText());
    }
    public void setCalcSolution(String solution) {
        textField.setText(solution);
    }
    public void setButtonOperands(String buttonOperands) {
        textField.setText(buttonOperands);
    }
    public void addCalculateListener(ActionListener listenForButtons) {
        bcalc.addActionListener(listenForButtons);
        b1.addActionListener(listenForButtons);
        b2.addActionListener(listenForButtons);
        b3.addActionListener(listenForButtons);
        b4.addActionListener(listenForButtons);
        b5.addActionListener(listenForButtons);
        b6.addActionListener(listenForButtons);
        b7.addActionListener(listenForButtons);
        b8.addActionListener(listenForButtons);
        b9.addActionListener(listenForButtons);
        b0.addActionListener(listenForButtons);
        badd.addActionListener(listenForButtons);
        bsub.addActionListener(listenForButtons);
        bmul.addActionListener(listenForButtons);
        bdiv.addActionListener(listenForButtons);
        bpow.addActionListener(listenForButtons);
        bclr.addActionListener(listenForButtons);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
