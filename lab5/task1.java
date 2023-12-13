package java.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class task1 {
    private static int milanScore = 0;
    private static int madridScore = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame("My GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);

        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(250,200));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel label1 = new JLabel("Result: 0 X 0");
        JLabel label2 = new JLabel("Last Scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");

        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                label1.setText("Result: "+milanScore+" X " +madridScore);
                label2.setText("Last Scorer: AC MILAN");

                if (madridScore == milanScore) {
                    label3.setText("Winner: DRAW");
                } else if (madridScore < milanScore) {
                    label3.setText("Winner: AC MILAN");
                } else {
                    label3.setText("Winner: MADRID");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                label1.setText("Result: "+milanScore+" X " +madridScore);
                label2.setText("Last Scorer: REAL MADRID");

                if (madridScore == milanScore) {
                    label3.setText("Winner: DRAW");
                } else if (madridScore > milanScore) {
                    label3.setText("Winner: MADRID");
                } else {
                    label3.setText("Winner: AC MILAN");
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
