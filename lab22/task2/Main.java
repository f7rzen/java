package java.lab22.task2;

public class Main {

    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView(model);
        CalculatorController controller = new CalculatorController(view, model);

        // Устанавливаем контроллер для представления
        view.setController(controller);
    }
}
