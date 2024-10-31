import Application.UI;
import chess.ChessMatch;

public static void main(String[] args) {
    ChessMatch chessMatch = new ChessMatch();

    UI.printBoard(chessMatch.getPieces());

}