package day17;

public class ChessBoard {
    private ChessPiece[][] chessPiece;

    public ChessBoard(ChessPiece[][] chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void print() {
        for (int i = 0; i < chessPiece.length; i++) {
            for (int j = 0; j < chessPiece[i].length; j++) {
                System.out.print(chessPiece[i][j].getCharacteristic());
            }
            System.out.println();
        }
    }
}
