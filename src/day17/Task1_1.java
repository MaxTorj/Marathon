package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1_1 {
    public static void main(String[] args) {
        List<ChessPiece> chessPiece = new ArrayList<>();
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.PAWN_WHITE);
        chessPiece.add(ChessPiece.PAWN_WHITE);

        chessPiece.add(ChessPiece.ROOK_BLACK);
        chessPiece.add(ChessPiece.ROOK_BLACK);
        chessPiece.add(ChessPiece.ROOK_BLACK);
        chessPiece.add(ChessPiece.ROOK_BLACK);

        System.out.println(chessPiece);
    }
}
