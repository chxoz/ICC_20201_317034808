package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
/**
 * @author iabin 
 * clase torre que extiende a la clase piece  y modela una torre
 */
public class Rook extends Piece {
    public Rook(Position p, ColorEnum color) {
        super(p, color);// llamada al comstrucyor de la clase Piece
        this.type = PiecesTypeEnum.ROOK;
    }
    /**
     * método getLegalMoves
     * @return una lista que contiene posiciones válidas
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        this.legalMoves = new LinkedList<Position>();// empezamos la lista de movimientos legales
        for (int i = this.position.getX() + 1; i < 8; i++) {// anexa los movimientos que pueden realizados a la derecha
            Position nextLegalPosition = new Position(i, this.position.getY());
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
 
                if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }

        for (int i = this.position.getX() - 1; i >= 0; i--) {// anexa los movimientos que pueden realizados a la izquierda
            Position nextLegalPosition = new Position(i, this.position.getY());
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY() + 1; i < 8; i++) {// anexa los movimientos que pueden realizados hacia abajo
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY() - 1; i >= 0; i--) {// anexa los movimientos que pueden realizados hacia arriba
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        return this.legalMoves;
    }

}