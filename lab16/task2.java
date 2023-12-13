package java.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.KeyEvent;

public class task2 extends JFrame implements KeyListener {
    private JLabel passwordLabel, resultLabel, userLabel, serviceLabel;
    private JTextField passwordField, userField, serviceField;
    Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(\\w){8,}$");

    public task2() {
        setTitle("Password application");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        serviceLabel = new JLabel("Service: ");
        panel.add(serviceLabel);

        serviceField = new JTextField();
        panel.add(serviceField);

        userLabel = new JLabel("User: ");
        panel.add(userLabel);

        userField = new JTextField();
        panel.add(userField);

        passwordLabel = new JLabel("Password: ");
        panel.add(passwordLabel);

        passwordField = new JTextField();
        passwordField.addKeyListener(this);
        panel.add(passwordField);

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        getContentPane().add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() ==  KeyEvent.VK_ENTER) {
            String password = passwordField.getText();
            Matcher m = p.matcher(password);
            if (m.matches()) {
                resultLabel.setText("Password is strong");
            } else {
                resultLabel.setText("Password is weak");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new task2();
    }
}

//aB1_qwerty