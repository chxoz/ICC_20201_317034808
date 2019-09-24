package shapesSVG;
/**
 * Clase que crea una línea
 */
public class Línea{
    private Vector2 a;
    private Vector2 b;
    private double longitud;
/**
 * Constructor que genera una línea una línea con dos puntos dados 
 * @param a punto a
 * @param b punto b
 */
public Línea(Vector2 a, Vector2 b){
    this.a = a;
    this.b = b;
}
/**
 * constructor que asigna valores a los vectores a y b
 * @param x1 valor de x para el vector a
 * @param y1 valor de y para el vector a
 * @param x2 valor de x para el vector b
 * @param y2 valor de y para el vector b
 */
public Línea(double x1, double y1, double x2, double y2){
    Vector2 uno = new Vector2(x1, y1);
    this.a = uno;
    Vector2 dos = new Vector2(x2, y2);
    this.b = dos;
}
/**
 * Constructor que genera una línea de 0 a 5
 */
public Línea(){
    Vector2 uno = new Vector2(0,0);
    Vector2 dos = new Vector2(5,0);
    this.a = uno;
    this.b = dos;
    
}
/**
 * Método que nos genera una línea en SVG
 * @return cadena con instrucciones para la línea 
 */
public String toSVG(){
    String tosvg ="<line x1='"+this.a.getx()+"' y1='"+this.a.gety()+"' x2='"+this.b.getx()+"' y2='"+this.b.gety()+"' stroke='blue' stroke-width='2'/>";
    return tosvg;
}
/**
 * Método que nos muestra los puntos de la linea 
 */
public String toString(){
    String lin = "línea que va de ("+this.a.getx()+","+this.a.gety()+") a  ("+this.b.getx()+","+this.b.gety()+")";
    return lin;
}
/**
 * Método que compara los puntos de dos líneas para saver si son iguales 
 * @param l Línea
 * @return verdadero si son iguales falso si no son iguales
 */
public boolean equals(Línea l){
    if(this.a.equals(l.a) && this.b.equals(l.b)){
        return true;
    }else{
        return false;
    }

}
}