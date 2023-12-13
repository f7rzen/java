package java.lab4;

public class task1 {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        int temperature = season.getAverageTemperature();

        System.out.printf("мое любимое время года %s, потому что в это время - %d градусов \n",season,temperature);

        printSeasonInfo(season);

        System.out.println(season.getDescription());

        for (Season s : Season.values()) {
            System.out.println(s + " - средняя температура: " + s.getAverageTemperature() + "°C");
            System.out.println("описание времени года: " + s.getDescription());
        }
    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case AUTUM:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            default:
                System.out.println("Неизвестное время года");
        }
    }
}
