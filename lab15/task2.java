package java.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame {
    JTextField textField = new JTextField(20);

    public task2() {
        setTitle("Программа с меню");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createMenu();
        createButtons();

        setLayout(new FlowLayout());
        add(textField);

        setVisible(true);
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Меню "Файл"
        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);

        // Подменю "Сохранить"
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        fileMenu.add(saveMenuItem);

        // Подменю "Выйти"
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        fileMenu.add(exitMenuItem);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Правка");
        menuBar.add(editMenu);

        // Подменю "Копировать"
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        editMenu.add(copyMenuItem);

        // Подменю "Вырезать"
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        editMenu.add(cutMenuItem);

        // Подменю "Вставить"
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        editMenu.add(pasteMenuItem);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Справка");
        menuBar.add(helpMenu);
    }

    private void createButtons() {
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика для кнопки 1
                JOptionPane.showMessageDialog(task2.this, "Нажата кнопка 1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика для кнопки 2
                JOptionPane.showMessageDialog(task2.this, "Нажата кнопка 2");
            }
        });

        add(button1);
        add(button2);
    }

    public static void main(String[] args) {
        new task2();
    }
}

