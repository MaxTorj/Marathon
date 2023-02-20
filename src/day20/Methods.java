package day20;

public class Methods {
    // Парсит одну координату (x,y)
    public static int[] parseCoordinate(String coordinatesInput) {
        String[] shipCoordinate = coordinatesInput.split(",");

        return new int[]{Integer.parseInt(shipCoordinate[0]),
                         Integer.parseInt(shipCoordinate[1])};
    }

    // Парсит координаты корабля (х1, у1; хn, yn)
    public static int[][] parseShipCoordinates(String shipCoordinates, int shipSize) {
        int[][] intCoordinates = new int[shipSize][2];

        String[] shipParts = shipCoordinates.split(";");

        for (int i = 0; i < shipParts.length; i++)
            intCoordinates[i] = parseCoordinate(shipParts[i]);

        return intCoordinates;
    }

    // Проверяет координаты х,у на корректность ввода
    public static boolean coordinateChecking(String inputCoordinate) {
        String[] xy = inputCoordinate.split(",");

        if (xy.length != 2) {
            System.out.println("В каждой из координат должно быть два значения, разделенных запятой");
            return false;
        }

        try {
            Integer.parseInt(xy[0]);
            Integer.parseInt(xy[1]);
        } catch (NumberFormatException e) {
            System.out.println("В качестве координат необходимо вводить только целые числа");
            return false;
        }

        if (Integer.parseInt(xy[0]) > 9 || Integer.parseInt(xy[0]) < 0
                || Integer.parseInt(xy[1]) > 9 || Integer.parseInt(xy[1]) < 0) {
            System.out.println("Координата может быть только в диапазоне от 0 до 9");
            return false;
        }

        return true;
    }

    // Проверяет координаты корабля на корректность ввода
    // (проверяет, что количество координат соответствует размеру корабля и проверяет отдельно каждую
    // координату х,у на корректность ввода)
    public static boolean coordinatesChecking(String playerInput, int correctNumberOfCoordinates) {
        String[] inputCoordinates = playerInput.split(";");

        if (inputCoordinates.length != correctNumberOfCoordinates) {
            System.out.println("Введено недостаточное количество координат. Необходимо " + correctNumberOfCoordinates);
            return false;
        }

        for (String coordinate : inputCoordinates) {
            if (!coordinateChecking(coordinate))
                return false;
        }

        return true;
    }

    // Проверяет, что координаты - это корректный ввод
    // для корректного корабля одна координата всегда должна быть одинаковой (0,1; 0,2; 0,3; и тд)
    // а вторая координата должна увеличиваться на единицу (0,1; 0,2; 0,3; и тд)
    public static boolean shipChecking(int[][] shipCoordinates, int shipSize) {
        if (shipSize == 1)
            return true;

        // Массивы только Х и только У для простоты следующих проверок
        int[] onlyX = new int[shipSize];
        int[] onlyY = new int[shipSize];

        for (int i = 0; i < shipSize; i++) {
            onlyX[i] = shipCoordinates[i][0];
            onlyY[i] = shipCoordinates[i][1];
        }

        // Проверка на одну координату константу
        if (!allValuesEqual(onlyX) && !allValuesEqual(onlyY))
            return false;

        // Проверка на одну возрастающую на единицу координату
        return allValuesAscending(onlyX) || allValuesAscending(onlyY);
    }

    // Проверяет, что в массиве все значения одинаковые (используется в методе shipChecking)
    private static boolean allValuesEqual(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0])
                return false;
        }

        return true;
    }

    // Проверяет, что в массиве значения увеличиваются на единицу (используется в методе shipChecking)
    private static boolean allValuesAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1)
                return false;
        }

        return true;
    }

    // Возвращает true, если корабль расположен по вертикали и false, если по горизонтали
    public static boolean verticalOrHorizontal(int [][] shipCoordinates) {
        // Массив только Х для простоты следующих проверок
        int[] onlyX = new int[shipCoordinates.length];

        for (int i = 0; i < shipCoordinates.length; i++)
            onlyX[i] = shipCoordinates[i][0];

        if (allValuesAscending(onlyX))
            return true;
        else
            return false;
    }
}
