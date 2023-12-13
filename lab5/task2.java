package java.lab5;

import javax.swing.*;

public class task2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JLabel label = new JLabel();

        for (int i = 0; i < args.length; i++) {
            ImageIcon icon = new ImageIcon(args[i]);
            label.setIcon(icon);
        }

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
