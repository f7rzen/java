package java.lab22.task2;

public class CalculatorModel {

    private double operand1;
    private double operand2;
    private String operator;
    private boolean newCalculation;

    public CalculatorModel() {
        operand1 = 0;
        operand2 = 0;
        operator = "";
        newCalculation = true;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isNewCalculation() {
        return newCalculation;
    }

    public void setNewCalculation(boolean newCalculation) {
        this.newCalculation = newCalculation;
    }

    public double performOperation() {
        double result = 0;

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
                    // Handle division by zero
                    System.out.println("Error: Division by zero");
                }
                break;
        }

        // Reset the model for the next calculation
        operand1 = result;
        operand2 = 0;
        operator = "";
        newCalculation = true;

        return result;
    }
}
