package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
import chess.pieces.chessPieces.Rook;
/**
 * @author chxoz
 * clase reina que extiende a la clase Rook  y modela una reina
 */
public class Queen extends Rook {
    public Queen(Position p, ColorEnum color) {
        super(p, color);// llamada al comstrucyor de la clase Piece
        this.type = PiecesTypeEnum.QUEEN;
    }
    /**
     * método getLegalMoves
     * @return una lista que contiene posiciones válidas
     */
    @Override
    public List<Position> getLegalMoves() {
        super.getLegalMoves();
        for(int i=this.position.getX()+1, j=this.position.getY()+1;i<8 && j<8;i++,j++){
            this.legalMoves.add(new Position(i,j)); // diagonal de la derecha hacia abajo 
        }
        for(int i=this.position.getX()-1, j=this.position.getY()-1;i>=0 && j>=0;i--,j--){
            this.legalMoves.add(new Position(i,j)); // diagonal de la izquierda hacia arriba 
        }
        for(int i=this.position.getX()+1, j=this.position.getY()-1;i<8 && j>=0;i++,j--){
            this.legalMoves.add(new Position(i,j)); // diagonal de la derecha hacia arriba 
        }
        for(int i=this.position.getX()-1, j=this.position.getY()+1;i>=0 && j<8;i--,j++){
            this.legalMoves.add(new Position(i,j)); //diagonal de la izquierda hacia abajo
        }	       
    
            return this.legalMoves;
    }

}