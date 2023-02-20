package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static day20.Methods.*;

public class BattleField {
    private String playerName;

    // корабль: 1
    // зона корабля: 0
    // пустое пространство поля: -1
    // атакованная клетка: -2

    private int[][] playerBattleField;
    // выставляется true, когда метод addPlayerBattleField() отработал до конца
    private boolean playerBattleFieldAdd;

    public BattleField(String playerName) {
        this.playerName = playerName;
        this.playerBattleField = new int[10][10];

        for (int[] row : this.playerBattleField) { // инициализирую матрицу значением -1 (пустым пространством)
            Arrays.fill(row, -1);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int[][] getPlayerBattleField() {
        return playerBattleField;
    }

    public boolean isPlayerBattleFieldAdd() {
        return playerBattleFieldAdd;
    }

    // Расставляем все корабли для этого поля
    public void addPlayerBattleField() {
        if (playerBattleFieldAdd) {
            System.out.println("Боевое поле игрока " + playerName + " уже готово");
            return;
        }

        System.out.println("Игра начинается!\n" +
                "Расставляйте корабли на боевом поле " + playerName + ". Игрок 2 не подсматривает!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты четырёхпалубного корабля (формат: х,у; х,у; х,у; х,у)");
        String playerInput = scanner.nextLine();

        while (!addShip(playerInput, 4))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты первого трёхпалубного корабля (формат: х,у; х,у; х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 3))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты второго трёхпалубного корабля (формат: х,у; х,у; х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 3))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты первого двухпалубного корабля (формат: х,у; х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 2))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты второго двухпалубного корабля (формат: х,у; х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 2))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты третьего двухпалубного корабля (формат: х,у; х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 2))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты первого однопалубного корабля (формат: х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 1))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты второго однопалубного корабля (формат: х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 1))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты третьего однопалубного корабля (формат: х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 1))
            playerInput = scanner.nextLine();

        System.out.println("Введите координаты четвертого однопалубного корабля (формат: х,у)");
        playerInput = scanner.nextLine();

        while (!addShip(playerInput, 1))
            playerInput = scanner.nextLine();

        playerBattleFieldAdd = true;
    }

    // вывод на экран
    public void printBattleField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (playerBattleField[i][j] == 1)
                    System.out.print("\uD83D\uDEE5");
                else if (playerBattleField[i][j] == 0)
                    System.out.print("\uD83D\uDFE6");
                else if (playerBattleField[i][j] == -2)
                    System.out.print("\uD83D\uDFE5");
                else
                    System.out.print("⬜");
            }

            System.out.println();
        }
    }

    /*
    Попытка поставить на поле новый корабль, принимая на вход ввод из консоли
    возвращает true, если корабль удалось поставить и false, если не удалось
    (не прошли все проверки, описанные в задании)
     */

    private boolean addShip(String playerInput, int shipSize) {
        if (!coordinatesChecking(playerInput, shipSize))
            return false;

        int[][] shipCoordinates = parseShipCoordinates(playerInput, shipSize);

        if (!shipChecking(shipCoordinates, shipSize)) {
            System.out.println("Неправильно установлен корабль. " + "Правильно установленный корабль - " +
                    "это последовательно идущие клетки (по вертикали или по горизонтали");
            return false;
        }

        if (!addingIsPossible(shipCoordinates, shipSize)) {
            System.out.println("Корабль должен занимать только свободные клетки на боевом поле. " +
                    "Вокруг корабля должно быть свободное поле шириной в одну клетку, " +
                    "в которой не может быть других кораблей (поле корабля)");
            return false;
        }

        addShip(shipCoordinates, shipSize);

        return true;
    }

    /*
    Этот метод вызывается в методе addShip(String playerInput, int shipSize) после того, как прошли проверки
    на все возможные условия. Этот метод непосредственно наносит на поле сам корабль и его поле
    меняет значение в двумерном массиве
    1 - сам корабль, 0 - поле этого корабля
     */
    private void addShip(int[][] shipCoordinates, int shipSize) {
        for (int[] shipCoordinate : shipCoordinates)
            // Назначение корабля
            playerBattleField[shipCoordinate[0]][shipCoordinate[1]] = 1;

        // Назначение поля корабля
        List<Integer[]> shipField = getShipField(shipCoordinates, shipSize);

        for (Integer[] shipFieldCoordinate : shipField)
            playerBattleField[shipFieldCoordinate[0]][shipFieldCoordinate[1]] = 0;
    }

    // Проверяет, что корабль с корректными координатами можно поставить на поле
    // Проверяет, что:
    // - Сам корабль занимает свободное пространство на поле
    // - В поле это корабля нет других кораблей
    private boolean addingIsPossible(int[][] shipCoordinates, int shipSize) {
        // Проверяем пространство для самого корабля
        for (int[] shipCoordinate : shipCoordinates) {
            if (playerBattleField[shipCoordinate[0]][shipCoordinate[1]] == 1)
                return false;
        }

        // Проверяем пространство поля корабля
        List<Integer[]> shipField = getShipField(shipCoordinates, shipSize);

        for (Integer[] shipFieldCoordinate : shipField) {
            if (playerBattleField[shipFieldCoordinate[0]][shipFieldCoordinate[1]] == 1)
                return false;
        }

        return true;
    }

    // Возвращает координаты поля корабля
    private List<Integer[]> getShipField(int[][] shipCoordinates, int shipSize) {
        List<Integer[]> shipField = new ArrayList<>();

        //Определяем расположение корабля (вертикально или горизонтально)
        boolean vertical = verticalOrHorizontal(shipCoordinates);

        if (vertical) {
            // Добавляем правый борт
            if (shipCoordinates[0][1] + 1 <= 9) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipField.add(new Integer[]{shipCoordinate[0], shipCoordinate[1] + 1});

                // Добавляем правую верхнюю клетку
                if (shipCoordinates[0][0] - 1 >= 0)
                    shipField.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1] + 1});

                // Добавляем правую нижнюю клетку
                if (shipCoordinates[shipSize - 1][0] + 1 <= 9) {
                    shipField.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1,
                    shipCoordinates[shipSize - 1][1] + 1});
                }
            }

            // Добавляем левый борт
            if (shipCoordinates[0][1] - 1 >= 0) {
                for (int[] shipCoordinate :shipCoordinates)
                    shipField.add(new Integer[]{shipCoordinate[0], shipCoordinate[1] - 1});

                // Добавляем левую верхнюю клетку
                if (shipCoordinates[0][0] - 1 >= 0)
                    shipField.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1] - 1});

                // Добавляем левую нижнюю клетку
                if (shipCoordinates[shipSize - 1][0] + 1 <= 9)
                    shipField.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1,
                    shipCoordinates[shipSize - 1][1] - 1});
            }

            // Добавляем верхнюю клетку
            if (shipCoordinates[0][0] - 1 >= 0)
                shipField.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1]});

            // Добавляем нижнюю клетку
            if (shipCoordinates[shipSize - 1][0] + 1 <= 9)
                shipField.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1, shipCoordinates[shipSize - 1][1]});

        } else {
            // Добавляем верхний борт
            if (shipCoordinates[0][0] - 1 >= 0) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipField.add(new Integer[]{shipCoordinate[0] - 1, shipCoordinate[1]});

                // Добавляем правую верхнюю клетку
                if (shipCoordinates[shipSize - 1][1] + 1 <= 9)
                    shipField.add(new Integer[]{shipCoordinates[shipSize - 1][0] - 1,
                            shipCoordinates[shipSize - 1][1] + 1});

                // Добавляем левую верхнюю клетку
                if (shipCoordinates[0][1] - 1 >= 0)
                    shipField.add(new Integer[]{shipCoordinates[0][0] - 1, shipCoordinates[0][1] - 1});
                }

            // Добавляем нижний борт
            if (shipCoordinates[0][0] + 1 <=9) {
                for (int[] shipCoordinate : shipCoordinates)
                    shipField.add(new Integer[]{shipCoordinate[0] + 1, shipCoordinate[1]});

                // Добавляем левую нижнюю клетку
                if (shipCoordinates[0][1] - 1 >= 0)
                    shipField.add(new Integer[]{shipCoordinates[0][0] + 1, shipCoordinates[0][1] - 1});

                // Добавляем правую нижнюю клетку
                if (shipCoordinates[shipSize - 1][1] + 1 <= 9)
                    shipField.add(new Integer[]{shipCoordinates[shipSize - 1][0] + 1,
                    shipCoordinates[shipSize - 1][1] + 1});
            }

            // Добавляем левую клетку
            if (shipCoordinates[0][1] - 1 >= 0)
                shipField.add(new Integer[]{shipCoordinates[0][0], shipCoordinates[0][1] - 1});

            // Добавляем правую клетку
            if (shipCoordinates[shipSize - 1][1] + 1 <= 9)
                shipField.add(new Integer[]{shipCoordinates[shipSize - 1][0],shipCoordinates[shipSize - 1][1] + 1});
        }

        return shipField;
    }
}
