package shapesSVG;
/**
 * Clase que modela un rectángulo
 */
public class Rectángulo{
    private Vector2 a;
    private double ancho;
    private double alto;
    private double perímetro;
    private double area;
/**
 * Constructor que genera un rectángulo con un punto el ancho y el alto 
 * @param a vector con coordenas x,y
 * @param ancho valor del ancho del rectángulo 
 * @param alto valor del alto del rectángulo
 */
public Rectángulo(Vector2 a, double ancho, double alto){
    this.a = a;
    this.ancho = ancho;
    this.alto = alto;
}
/**
 * Constructor de un rectangulo 
 * @param x coordenada x del vector
 * @param y coordenada y del vector 
 * @param ancho ancho del rectángulo
 * @param alto alto del rectángulo
 */
public Rectángulo(double x, double y, double ancho, double alto){
    Vector2 uno = new Vector2(x,y);
    this.a = uno;
    this.ancho = ancho;
    this.alto =alto;
}
/**
 * Constructor de un rectángulo con medidas 4 de alto y 8 de ancho 
 */
public Rectángulo(){
    Vector2 uno = new Vector2(0,0);
    this.a = uno;
    this.ancho = 8.0;
    this.alto = 4.0;
}
/**
 * Método que genera un rectángulo en svg 
 * @return cadena con instrucciones para el rectángulo 
 */
public String toSVG(){
    String tosvg = "<rect x ='"+this.a.getx()+"' y = '"+this.a.gety()+"' width='"+this.ancho+"' height='"+this.alto+"' />";
    return tosvg;
}
/**
 * Método que nos muestra las demensiones del rectángulo
 */
public String toString(){
    String rec = "Rectángulo que va del punto ('"+this.a.getx()+"','"+this.a.gety()+"') con altura '"+this.alto+"' y ancho '"+this.ancho+"' ";
    return rec;
}
/**
 * Método que compara si dos rectangulos son iguales
 * @return verdadero si son iguales falso si no son guales 
 */
public boolean equals(Rectángulo rec){
    if(this.a.getx()==rec.a.getx() && this.a.gety()==rec.a.gety() && this.alto==rec.alto && this.ancho==rec.ancho){
        return true;
    }else{
        return false;
    }
}
}