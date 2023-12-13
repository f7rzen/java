package java.lab22.task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();

        // Изменение: передача текста кнопки в метод updateModel
        updateModel(buttonText);
    }

    private void calculateResult() {
        double result = model.performOperation();
        view.updateDisplay(Double.toString(result));
    }

    public void updateModel(String buttonText) {
        String currentDisplay = view.getDisplayText();

        if (!currentDisplay.isEmpty()) {
            if (model.isNewCalculation()) {
                model.setOperand1(Double.parseDouble(currentDisplay));
                model.setNewCalculation(false);
            } else {
                model.setOperand2(Double.parseDouble(currentDisplay));
                model.setOperand1(model.performOperation());
            }

            model.setOperator(buttonText);
            view.updateDisplay("");
        } else {
            System.out.println("Error: Display is empty");
        }
    }




}
