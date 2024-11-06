package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Enums.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //ne
        p.setValues(position.getRow() -1, position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);
            p.setColumn(p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //nw
        p.setValues(position.getRow() -1, position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            System.out.println("Chegou ");
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //sw
        p.setValues(position.getRow() +1, position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            System.out.println("Chegou ");
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()+1);
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //se
        p.setValues(position.getRow() +1, position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()+1);
            p.setColumn(p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }


        return mat;
    }
}