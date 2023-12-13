package java.lab22.task2;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {

    JFrame frame;
    JTextField display;
    JPanel panel;
    JButton button;
    private CalculatorController controller;

    public CalculatorView(CalculatorModel model) {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        display = new JTextField();
        display.setBounds(0, 0, 300, 50);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.LEFT);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.setBounds(0, 50, 300, 320);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "+", "="
        };

        for (String label : buttonLabels) {
            button = new JButton(label);
            panel.add(button);
        }

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        // Create an instance of CalculatorController and set it as the controller for the view
        CalculatorController controller = new CalculatorController(this, model);
        setController(controller);

        // Add action listeners after creating the controller
        for (Component component : panel.getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).addActionListener(controller);
            }
        }
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
    }

    public void updateDisplay(String text) {
        display.setText(text);
    }

    public String getDisplayText() {
        return display.getText();
    }

}