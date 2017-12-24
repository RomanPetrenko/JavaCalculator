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
            if (e.getSource() == theView.b1) {
                sb.append("1");
            }
            if (e.getSource() == theView.b2) {
                sb.append("2");
            }
            if (e.getSource() == theView.b3) {
                sb.append("3");
            }
            if (e.getSource() == theView.b4) {
                sb.append("4");
            }
            if (e.getSource() == theView.b5) {
                sb.append("5");
            }
            if (e.getSource() == theView.b6) {
                sb.append("6");
            }
            if (e.getSource() == theView.b7) {
                sb.append("7");
            }
            if (e.getSource() == theView.b8) {
                sb.append("8");
            }
            if (e.getSource() == theView.b9) {
                sb.append("9");
            }
            if (e.getSource() == theView.b0) {
                sb.append("0");
            }
            if (e.getSource() == theView.bdiv) {
                sb.append("/");
            }
            if (e.getSource() == theView.bmul) {
                sb.append("*");
            }
            if (e.getSource() == theView.badd) {
                sb.append("+");
            }
            if (e.getSource() == theView.bsub) {
                sb.append("-");
            }
            if (e.getSource() == theView.bpow) {
                sb.append("^");
            }
            if (e.getSource() == theView.bclr) {
                sb.delete(0, sb.length());
            }
            theView.setButtonOperands(sb.toString());
        }
    }
}
