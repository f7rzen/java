package java.lab15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class task1 extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("%");

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    // Начало конструктора класса LabExample
    task1() {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(300, 150);

        // Создаем надпись 1
        add(new JLabel("1st Number"));

        // Добавляем текстовое поле jta1
        add(jta1);

        // Создаем надпись 2
        add(new JLabel("2nd Number"));

        // Добавляем текстовое поле jta2
        add(jta2);

        // Добавляем кнопки для различных операций
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        // Добавляем слушателей к кнопкам
        addButton.addActionListener(getActionListenerForOperation("+"));
        subtractButton.addActionListener(getActionListenerForOperation("-"));
        multiplyButton.addActionListener(getActionListenerForOperation("*"));
        divideButton.addActionListener(getActionListenerForOperation("/"));

        // Установка видимости окна
        setVisible(true);
    } // Конец конструктора

    private ActionListener getActionListenerForOperation(String operation) {
        return new ActionListener() {
            // Добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());

                    // Переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    double result = 0;

                    // Выполняем операцию в зависимости от выбранной кнопки
                    switch (operation) {
                        case "+":
                            result = x1 + x2;
                            break;
                        case "-":
                            result = x1 - x2;
                            break;
                        case "*":
                            result = x1 * x2;
                            break;
                        case "/":
                            // Проверка деления на ноль
                            if (x2 != 0) {
                                result = x1 / x2;
                            } else {
                                JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            break;
                    }

                    // Создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + result, "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    // Обработка ошибок при неверном формате ввода
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
    }

    public static void main(String[] args) {
        new task1();
    } // Конец main()
} // Конец класса LabExample
