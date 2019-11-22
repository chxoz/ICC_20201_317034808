package chess.pieces;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
/**
 * @author iabin
 * clase que modela piezas de ajedrez
 */
public abstract class Piece{
    protected Position position;
    protected List<Position> legalMoves = null;
    protected PiecesTypeEnum type;
    protected ColorEnum color;
    protected Board board;
    /**
     * constructor Piece 
     * @param p posición de la piza
     * @param color color de la pieza
     * @return Piece regresa una pieza
     */
    public Piece(Position p, ColorEnum color) {
        this.position = p;
        this.color = color;
    }

    /**
     * método isAppendable
     * @param p posición
     * @return un número que decide que sucederá con las piezas  
     */
    public int isAppendable(Position p){
        Board board = Board.getInstance();
        Piece piece = board.getPiece(p);
        if(piece.getColor() == this.getColor())return -1;
        if(piece.getColor() != ColorEnum.NONE)return 0;
        return 1;
    }
    /**
     * método getPosition
     * @return Position; regresa una posición
     */
    public Position getPosition(){
        return this.position;
    }
    /**
     * método getColor
     * @return color; regresa el color de la pieza 
     */
    public ColorEnum getColor(){
        return this.color;
    }
    /**
     * método getType
     * @return tipo de la pieza
     */
    public PiecesTypeEnum getType(){
        return this.type;
    }
    /**
     * método moveTo  
     * @param p posición
     */
    public void moveTo(Position p) {
        if (isLegalMove(p)) {
            this.position = p;
            this.legalMoves = null;
            return;
        } else
            return;
    }
    /**
     * método abstracto getLegalMoves
     * regresa los movimientos legales de las piezas
     */
    public abstract List<Position> getLegalMoves();
   /**
    * método isLegalPosition
    * @param p recibe una posición
    * @return true si es un movimiento legal false false en el otro caso
    */
    public boolean isLegalMove(Position p) {
        List<Position> moves = this.getLegalMoves();
        return (moves.contains(p)) ? true : false;
    }
    /**
     * método toString
     * regresa una cadena
     */
    @Override
    public String toString() {
        return this.type.toString();
    }
    /**
     * método equals
     * @param obj es un objeto, si no es de la clase piece entonces regresa falso
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Piece))return false;//si el objeto no es de la clase piece entonces regresa falso
        Piece p = (Piece)obj;
        if(p.getType().equals(this.type) && p.getColor().equals(this.getColor()) && p.getPosition().equals(this.position))
        return true; //si los atributos de ambas clases tienen los mismos valores regresa true, false en el otro caso 
        return false;
    }
}