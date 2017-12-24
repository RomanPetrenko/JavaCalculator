package com.roman.petrenko.controller;

import com.roman.petrenko.model.CalculatorModel;
import com.roman.petrenko.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        private StringBuffer sb = new StringBuffer();

        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(theView.bcalc)) {
                try {
                    theModel.calculate(theView.getNumbers());
                    sb.append(" = ");
                    sb.append(Integer.toString(theModel.getCalculationValue()));
                    theView.setCalcSolution(sb.toString());
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    theView.displayErrorMessage("You Need to Enter Integers");
                } catch (ArithmeticException ea) {
                    ea.printStackTrace();
                    theView.displayErrorMessage("Can't divide on 0");
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }
            if (e.getSource().equals(theView.b1)) {
                sb.append("1");
            }
            if (e.getSource().equals(theView.b2)) {
                sb.append("2");
            }
            if (e.getSource().equals(theView.b3)) {
                sb.append("3");
            }
            if (e.getSource().equals(theView.b4)) {
                sb.append("4");
            }
            if (e.getSource().equals(theView.b5)) {
                sb.append("5");
            }
            if (e.getSource().equals(theView.b6)) {
                sb.append("6");
            }
            if (e.getSource().equals(theView.b7)) {
                sb.append("7");
            }
            if (e.getSource().equals(theView.b8)) {
                sb.append("8");
            }
            if (e.getSource().equals(theView.b9)) {
                sb.append("9");
            }
            if (e.getSource().equals(theView.b0)) {
                sb.append("0");
            }
            if (e.getSource().equals(theView.bdiv)) {
                sb.append("/");
            }
            if (e.getSource().equals(theView.bmul)) {
                sb.append("*");
            }
            if (e.getSource().equals(theView.badd)) {
                sb.append("+");
            }
            if (e.getSource().equals(theView.bsub)) {
                sb.append("-");
            }
            if (e.getSource().equals(theView.bpow)) {
                sb.append("^");
            }
            if (e.getSource().equals(theView.bclr)) {
                sb.delete(0, sb.length());
            }
            theView.setButtonOperands(sb.toString());
        }
    }
}
