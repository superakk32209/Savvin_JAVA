package Pr20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField inputField;
    private JButton[] digitButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    public CalculatorView() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 12, 12));

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(Integer.toString(i));
            digitButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(digitButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(button);
        }

        equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 18));

        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addDigitButtonListener(ActionListener listener) {
        for (JButton button : digitButtons) {
            button.addActionListener(listener);
        }
    }

    public void addOperatorButtonListener(ActionListener listener) {
        for (JButton button : operatorButtons) {
            button.addActionListener(listener);
        }
    }

    public void addEqualsButtonListener(ActionListener listener) {
        equalsButton.addActionListener(listener);
    }

    public void addClearButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener);
    }

    public void updateInputField(String text) {
        inputField.setText(text);
    }
}
