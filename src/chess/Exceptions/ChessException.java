package chess.Exceptions;

import boardGame.Exceptions.BoardException;

public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}
