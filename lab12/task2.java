package java.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AnimationPanel extends JPanel {
    private Image[] frames;
    private int currentFrameIndex;
    private Timer timer;

    public AnimationPanel(String[] framePaths) {
        frames = new Image[framePaths.length];
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]).getImage();
        }

        currentFrameIndex = 0;

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrameIndex = (currentFrameIndex + 1) % frames.length; //обновляя текущий кадр
                repaint(); //запрос на перерисовку компонента
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrameIndex], 0, 0, this);
    }
}

public class task2 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }

        if (args.length == 0) {
            System.out.println("error");
            return;
        }

        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 780);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Устанавливаем координаты для появления окна посередине экрана
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);

        // Передача путей к файлам из аргументов командной строки
        AnimationPanel animationPanel = new AnimationPanel(args);
        frame.add(animationPanel);
        frame.setVisible(true);
    }
}


