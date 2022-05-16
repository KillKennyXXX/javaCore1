public class HomeWorkApp {

    public static void main(String[] args) {
        drawSquare();

        checkHomework();
        howIsTheWeatherThere();
    }

    public static void drawSquare() {
        System.out.println(" ---");
        System.out.println(" | |");
        System.out.println(" ---");
    }

    public static void checkHomework() {
        int tasksCount = 6;

        if (tasksCount == 6) {
            System.out.println("Великолепно, Вы выполнили все задачи!");
        }
        if (tasksCount > 3 && tasksCount < 6) {
            System.out.println("Отлично, Вы выполнили почти все задачи!");
        }
        if (tasksCount <= 3) {
            System.out.println("Вы решили меньше половины, но Вы все равно молодец, надо же с чего-то начинать!!");
        }

        System.out.println("Проверка завершена");
    }

    public static void howIsTheWeatherThere() {
        int temperature = 10;

        if (temperature > 10) {
            System.out.println("На улице очень даже тепло для марта месяца");
        } else if (temperature > -5) {
            System.out.println("Для марта самое то");
        } else {
            System.out.println("А там точно весна?");
        }
    }
}
