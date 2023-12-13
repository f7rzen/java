package java.lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс Shape
abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    // Конструктор
    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод для отрисовки фигуры
    abstract void draw(Graphics g);
}

// Класс для круга
class Circle extends Shape {
    private int radius;

    // Конструктор
    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    // Метод для отрисовки круга
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

// Класс для квадрата
class Square extends Shape {
    private int side;

    // Конструктор
    public Square(Color color, int x, int y, int side) {
        super(color, x, y);
        this.side = side;
    }

    // Метод для отрисовки квадрата
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, side, side);
    }
}

// Панель для рисования фигур
class DrawPanel extends JPanel {
    private static final int NUM_SHAPES = 20;
    private Shape[] shapes;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random random = new Random();
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(getWidth() - 50);
            int y = random.nextInt(getHeight() - 50);
            int size = random.nextInt(50) + 20;
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            if (random.nextBoolean()) {
                shapes[i] = new Circle(randomColor, x, y, size);
            } else {
                shapes[i] = new Square(randomColor, x, y, size);
            }
        }

        for (int i = 0; i < NUM_SHAPES; i++) {
            shapes[i].draw(g);
        }
    }
}

// Главный класс
public class task1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Создаем панель для рисования фигур
        DrawPanel drawPanel = new DrawPanel();
        frame.add(drawPanel);

        frame.setVisible(true);
    }
}
