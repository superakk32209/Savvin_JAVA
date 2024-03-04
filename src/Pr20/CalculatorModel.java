package Pr20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorModel {
    private double result;

    public void performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
                break;
        }
    }

    public double getResult() {
        return result;
    }
}

