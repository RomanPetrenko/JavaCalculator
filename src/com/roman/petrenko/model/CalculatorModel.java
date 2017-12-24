package com.roman.petrenko.model;
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;

public class CalculatorModel {

    private int calculationValue;

    public void calculate (String strNumbers) throws IllegalAccessException {
        Pattern pattern = Pattern.compile("([0-9]+)|(\\+|\\-|\\*|\\/|\\^)");
        Matcher matcher = pattern.matcher(strNumbers);
        List<String> formatedNumbers = new ArrayList<>();
        while (matcher.find()) {
            formatedNumbers.add(matcher.group());
        }

        int firstNumber = Integer.parseInt(formatedNumbers.get(0));
        int secondNumber;
        for (int i = 1; i < formatedNumbers.size(); i++) {
            if (formatedNumbers.get(i).equals("+")) {
                secondNumber = Integer.parseInt(formatedNumbers.get(i+1));
                calculation(firstNumber, secondNumber, '+');
                firstNumber = calculationValue;
            }
            if (formatedNumbers.get(i).equals("-")) {
                secondNumber = Integer.parseInt(formatedNumbers.get(i+1));
                calculation(firstNumber, secondNumber, '-');
                firstNumber = calculationValue;
            }
            if (formatedNumbers.get(i).equals("*")) {
                secondNumber = Integer.parseInt(formatedNumbers.get(i+1));
                calculation(firstNumber, secondNumber, '*');
                firstNumber = calculationValue;
            }
            if (formatedNumbers.get(i).equals("/")) {
                secondNumber = Integer.parseInt(formatedNumbers.get(i+1));
                calculation(firstNumber, secondNumber, '/');
                firstNumber = calculationValue;
            }
            if (formatedNumbers.get(i).equals("^")) {
                secondNumber = Integer.parseInt(formatedNumbers.get(i+1));
                calculation(firstNumber, secondNumber, '^');
                firstNumber = calculationValue;
            }

        }


    }

    public void calculation (int firstNumber, int secondNumber, char operation)
            throws ArithmeticException {
        switch (operation) {
            case '+':
                calculationValue = firstNumber + secondNumber;
                break;
            case '-':
                calculationValue = firstNumber - secondNumber;
                break;
            case '*':
                calculationValue = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new ArithmeticException ("Can't divide on 0");
                }
                else calculationValue = firstNumber / secondNumber;
                break;
            case '^': calculationValue = (int) Math.pow(firstNumber, secondNumber);
                break;
        }
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}
