package Pr20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    private String currentInput;
    private double currentOperand;
    private String currentOperator;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        currentInput = "";
        currentOperand = 0;
        currentOperator = "";

        view.addDigitButtonListener(new DigitButtonListener());
        view.addOperatorButtonListener(new OperatorButtonListener());
        view.addEqualsButtonListener(new EqualsButtonListener());
        view.addClearButtonListener(new ClearButtonListener());
    }

    private class DigitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            currentInput += sourceButton.getText();
            view.updateInputField(currentInput);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            if (!currentInput.isEmpty()) {
                currentOperand = Double.parseDouble(currentInput);
                currentInput = "";
                currentOperator = sourceButton.getText();
            }
            view.updateInputField(currentOperator);
        }
    }

    private class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
                try {
                    double secondOperand = Double.parseDouble(currentInput);
                    model.performOperation(currentOperand, secondOperand, currentOperator);
                    view.updateInputField(Double.toString(model.getResult()));
                    currentInput = "";
                    currentOperand = model.getResult();
                    currentOperator = "";
                } catch (NumberFormatException | ArithmeticException ex) {
                    view.updateInputField("Error");
                }
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentInput = "";
            currentOperand = 0;
            currentOperator = "";
            view.updateInputField("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorModel model = new CalculatorModel();
            CalculatorView view = new CalculatorView();
            CalculatorController controller = new CalculatorController(model, view);
        });
    }
}
