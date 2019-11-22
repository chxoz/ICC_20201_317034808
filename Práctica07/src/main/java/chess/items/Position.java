package chess.items;
/**
 * @author iabin
 * clase posición 
 * clase que modela el movimiento de una pieza de ajedrez
 */
public class Position{
    private int x;// número de la fila de un arreglo
    private int y;// número de la columna de un arreglo
    /**
     * constructor de una posición ([x][y])
     * @param x número de la fila 
     * @param y número de la columna
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * método getX
     * @return  x que es el número de la fila    
     */
    public int getX() {
        return x;
    }
    /**
     * método is legal verifica que x e y respeten el tamaño del tablero y no se salgan de él
     * @return true si [x][y] está dontro del tablero 
     */
    public boolean isLegal(){
        return (this.x < 8 && this.x > -1 && this.y < 8 && this.y > -1 )? true: false;
    }
    /**
     * método getY
     * @return y número de la columna
     */
    public int getY() {
        return y;
    }
    /**
     * método equals 
     * @param obj es un objeto, si no es de la clase position entonces regresa falso
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position))return false;//si el objeto no es de la clase position entonces regresa falso
        Position p = (Position)obj;// cast 
        return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;//si el atributo x e y de p son iguales a los de obj entonces regresa true, false en el otro caso 
    }
    /**
     * método toString
     * regresa x & y en la terminal
     */
    @Override
    public String toString() {
        return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
    }
    /**
     * Método isOutOfBoard
     * regresa true si el movimiento es válido(está dentro del tablero) false en otro caso
     */
    public boolean isOutOfBoard(int board_size){
        if(this.y >= board_size)return false;
        if(this.x >= board_size)return false;
        if(this.y < 0)return false;
        if(this.x < 0)return false;
        return true;
    }
}