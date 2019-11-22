package chess.items;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.Empty;
import chess.pieces.chessPieces.Rook;
/**
 * @author iabin
 * clase board; modela un tablero de ajedrez
 */
public class Board{
    public int SIZE = 8;//tamaño del tablero
    public Piece[][] matrix;
    private static Board instance = null;//
    /**
     * constructor 
     */
    private Board(){
        this.matrix = new Piece[SIZE][SIZE];//crea piezas
        for (int i = 0; i < SIZE; i++) {//recorre las filas del arreglo
            for (int j = 0; j < SIZE; j++) {//recorre las columnas del arreglo
                this.matrix[i][j] = new Empty(new Position(i, j), ColorEnum.NONE);//llena el tablero con piezas "vacias" para evitar las excepciones de java 
            }
        }
        this.matrix[4][0] = new Rook(new Position(4, 0), ColorEnum.WHITE);//torre blanca en la posición 4,0
        this.matrix[7][0] = new Rook(new Position(7, 0), ColorEnum.BLACK);//torre negra en la posición 7,0
        this.matrix[4][4] = new Rook(new Position(4, 4), ColorEnum.BLACK);//torre negra en la posición 4,4
    }
    /**
     * método getIntance
     * @return instance que es un tablero 
     */
    public static Board getInstance(){
        if(instance == null)//pregunta el valor de instance, como siempre es null entonces siempre entra al bloque de instrucciones
            instance = new Board();// crea un nuevo tablero
        return instance;
    }
    /**
     * método getSize 
     * @return SIZE;  8
     */
    public int getSize(){
        return this.SIZE;
    }
    /**
     * método move
     * mueve piezas 
     * @param p objeto de la clase position
     * @param q objeto de la clase position
     */
    public void move(Position p, Position q){
        if(!p.isLegal() || !q.isLegal())return;
        Piece piece = this.getPiece(p);
        if(!piece.isLegalMove(q))return;
        piece.moveTo(q);
        this.matrix[p.getX()][p.getY()] = new Empty(p,ColorEnum.NONE);
        this.matrix[q.getX()][q.getY()] = piece; 
    }
    /**
     * método getPiece
     * @param p una posición
     * @return piece; regresa una pieza 
     */
    public Piece getPiece(Position p){
        //if(p.isOutOfBoard(SIZE))return null;
        return this.matrix[p.getX()][p.getY()];
    }

    /**
     * métod toString
     * @return result 
     */
    public String toString(){
        var result = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result = " "+ this.matrix[i][j]+" "+result;
            }
            result += '\n';
        }
        return result;
    }

}