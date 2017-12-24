package com.roman.petrenko;

import com.roman.petrenko.controller.CalculatorController;
import com.roman.petrenko.model.CalculatorModel;
import com.roman.petrenko.view.CalculatorView;

public class Main {

    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView,theModel);
        theView.setVisible(true);
    }

}
