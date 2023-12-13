package java.lab4;

enum Season {
    SUMMER(30), WINTER(-10), AUTUM(10), SPRING(15);

    private int averageTemperature;

    private Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else if (this == WINTER) {
            return "Холодное время года";
        } else if (this == AUTUM) {
            return "Странное время года";
        } else if (this == SPRING) {
            return "Красивое время года";
        } else {
            return "Неизвестное время года";
        }
    }
}
