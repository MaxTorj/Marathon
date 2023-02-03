package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 0 -> System.out.println("Команды не полные, еще есть шесть свободных мест");
                case 1 -> System.out.println("Команды не полные, еще есть пять свободных мест");
                case 2 -> System.out.println("Команды не полные, еще есть четыре свободных места");
                case 3 -> System.out.println("Команды не полные, еще есть три свободных места");
                case 4 -> System.out.println("Команды не полные, еще есть два свободных места");
                case 5 -> System.out.println("Команды не полные, еще есть одно свободное место");
                default -> System.out.println("Мест в командах больше нет");
            }
        }
    }
}