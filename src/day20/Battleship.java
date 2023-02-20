package day20;

import java.util.Scanner;

import static day20.Methods.coordinateChecking;
import static day20.Methods.parseCoordinate;


public class Battleship {
    // Поле первого игрока
    private BattleField player1Field;
    // Поле второго игрока
    private BattleField player2Field;

    // true, пока игра идет. false, когда заканчивается
    private boolean gameIsOn;
    // Чей сейчас ход (true - player 1, false player 2)
    private boolean isPlayer1;
    // Количество действующих кораблей игрока 1
    private int player1ShipAmount;
    // Количество действующих кораблей игрока 2
    private int player2ShipAmount;

    // Единственный конструктор, проверяется, что оба поля заполнены, также
    // происходит инициализация значения всех полей
    public Battleship(BattleField player1Field, BattleField player2Field) {
        if (!player1Field.isPlayerBattleFieldAdd() || !player2Field.isPlayerBattleFieldAdd()) {
            System.out.println("Создание игры остановлено. Корабли на обоих полях должны быть расставлены");
            throw new IllegalArgumentException();
        }

        this.player1Field = player1Field;
        this.player2Field = player2Field;

        this.player1ShipAmount = 10;
        this.player2ShipAmount = 10;

        gameIsOn = true;

        // Кто ходит первый
        isPlayer1 = Math.random() >= 0.5;
    }

    // Запуск цикла игры пока gameIsOn = true:
    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (gameIsOn) {
            if (isPlayer1)
                System.out.println(player1Field.getPlayerName() + ", ваш ход");
            else
                System.out.println(player2Field.getPlayerName() + ", ваш ход");

            String playerInput = scanner.nextLine();

            if (!makeMove(isPlayer1, playerInput))
                System.out.println("Некорректный ход. Повторите ход");
        }
    }

    // Возвращает true, если playerInput - корректный ход. Возвращает false, если playerInput - некорректный ход
    // Первый аргумент true, если это ход первого игрока, false, если это ход второго игрока
    private boolean makeMove(boolean isPlayer1, String playerInput) {
        if (!coordinateChecking(playerInput))
            return false;

        int[] coordinate = parseCoordinate(playerInput);

        if (isPlayer1)
            hit(player2Field.getPlayerBattleField(), coordinate);
        else
            hit(player1Field.getPlayerBattleField(), coordinate);

        if (player1ShipAmount == 0) {
            System.out.println(player2Field.getPlayerName() + " победил! Игра закончена");
            gameIsOn = false;
        }

        if (player2ShipAmount == 0) {
            System.out.println(player1Field.getPlayerName() + " победил! Игра закончена");
            gameIsOn = false;
        }

        return true;
    }

    // Производит удар по ячейке
    // Выводит сообщение либо "Мимо!", либо "Попадание", либо "Утопил".
    // В случае потопления декрементирует количество кораблей на плаву
    // Переводит право на ход другому игроку, если удар был "Мимо!"
    private void hit(int[][] playerField, int[] hitCoordinate) {

        if (playerField[hitCoordinate[0]][hitCoordinate[1]] == 1) {
            playerField[hitCoordinate[0]][hitCoordinate[1]] = -2;

            if (shipSpank(playerField, hitCoordinate)) {
                System.out.println("Утопил!");

                if (isPlayer1)
                    player2ShipAmount--;
                else
                    player1ShipAmount--;
            } else {
                System.out.println("Попадание");
            }

        } else {
            System.out.println("Мимо!");
            isPlayer1 = !isPlayer1; // Переход хода
        }
    }

    // true - если удар утопил корабль
    // false - если удар не утопил корабль
    private boolean shipSpank(int[][] playerField, int[] hitCoordinate) {
        // идем вверх - вниз и вправо-влево пока не упремся в ореол.
        // проверяем, есть ли 1
        int x = hitCoordinate[0];
        int y = hitCoordinate[1];

        while (playerField[x][y] != 0) {
            x -= 1;
            if (playerField[x][y] == 1)
                return false;
        }

        x = hitCoordinate[0];
        while (playerField[x][y] != 0) {
            x += 1;
            if (playerField[x][y] == 1)
                return false;
        }

        x = hitCoordinate[0];
        while (playerField[x][y] != 0) {
            y -= 1;
            if (playerField[x][y] == 1)
                return false;
        }

        y = hitCoordinate[0];
        while (playerField[x][y] != 0) {
            y += 1;
            if (playerField[x][y] == 1)
                return false;
        }

        return true;
    }
}
