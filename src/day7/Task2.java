package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(95);
        Player player2 = new Player(90);
        Player player3 = new Player(87);
        Player player4 = new Player(88);
        Player player5 = new Player(85);
        Player player6 = new Player(92);

        for (int i = 0; i < 10; i++)
            player1.run();

        System.out.println("Оставшаяся выносливость первого игрока: " + player1.getStamina() + "%");

        for (int i = 0; i < 55; i++)
            player2.run();

        System.out.println("Оставшаяся выносливость второго игрока: " + player2.getStamina() + "%");

        for (int i = 0; i < 62; i++)
            player3.run();

        System.out.println("Оставшаяся выносливость третьего игрока: " + player3.getStamina() + "%");

        for (int i = 0; i < 88; i++)
            player4.run();

        System.out.println("Оставшаяся выносливость четвертого игрока: " + player4.getStamina() + "%");

        for (int i = 0; i < 85; i++)
            player5.run();

        System.out.println("Оставшаяся выносливость пятого игрока: " + player5.getStamina() + "%");

        for (int i = 0; i < 90; i++)
            player6.run();

        System.out.println("Оставшаяся выносливость шестого игрока: " + player6.getStamina() + "%");

        Player.info();
    }
}
