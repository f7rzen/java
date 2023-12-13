package java.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JMenu colorMenu, fontMenu;
    private JMenuItem blueItem, redItem, blackItem, timesNewRomanItem, msSansSerifItem, courierNewItem;

    public task1() {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);

        blueItem = new JMenuItem("Синий");
        blueItem.addActionListener(this);
        colorMenu.add(blueItem);

        redItem = new JMenuItem("Красный");
        redItem.addActionListener(this);
        colorMenu.add(redItem);

        blackItem = new JMenuItem("Черный");
        blackItem.addActionListener(this);
        colorMenu.add(blackItem);

        fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(this);
        fontMenu.add(timesNewRomanItem);

        msSansSerifItem = new JMenuItem("MS Sans Serif");
        msSansSerifItem.addActionListener(this);
        fontMenu.add(msSansSerifItem);

        courierNewItem = new JMenuItem("Courier New");
        courierNewItem.addActionListener(this);
        fontMenu.add(courierNewItem);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blueItem) {
            textArea.setForeground(Color.BLUE);
        } else if (e.getSource() == redItem) {
            textArea.setForeground(Color.RED);
        } else if (e.getSource() == blackItem) {
            textArea.setForeground(Color.BLACK);
        } else if (e.getSource() == timesNewRomanItem) {
            textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        } else if (e.getSource() == msSansSerifItem) {
            textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
        } else if (e.getSource() == courierNewItem) {
            textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
        }
    }

    public static void main(String[] args) {
        new task1();
    }
}
