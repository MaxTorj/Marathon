package day20;

public class Game {
    public static void main(String[] args) {
        BattleField battleField1 = new BattleField("Игрок 1");
        battleField1.addPlayerBattleField();
        battleField1.printBattleField();

        BattleField battleField2 = new BattleField("Игрок 2");
        battleField2.addPlayerBattleField();
        battleField2.printBattleField();

        Battleship battleship = new Battleship(battleField1, battleField2);
        battleship.play();
    }
}

// Пример игрового поля:
// 4-х палубник: 0,6;1,6;2,6;3,6
// 3-х палубник: 0,2;1,2;2,2
// 3-х палубник: 4,2;4,3;4,4
// 2-х палубник: 9,2;9,3
// 2-х палубник: 2,9;3,9
// 2-х палубник: 6,6;6,7
// 1-но палубник: 0,0
// 1-но палубник: 0,9
// 1-но палубник: 9,0
// 1-но палубник: 9,9