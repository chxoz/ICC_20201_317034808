package shapesSVG;
/**
 * Clase que genera un triangulo
 */
public class Tríangulo{
    private Vector2 a;
    private Vector2 b;
    private Vector2 c;
    private double perímetro;
    private double area;
    /**
     * Constructor que genera tres puntos para despues hacer líneas
     * @param a punto a 
     * @param b punto b
     * @param c punto c
     */
    public Tríangulo(Vector2 a, Vector2 b, Vector2 c){
        this.a = a;
        this.b = b;
        this.c = c;  
    }
    /**
     * Constructor que genera el triangulo con tres líeas
     * @param x1 coordenada x de la línea uno
     * @param y1 coordenada y de la línea uno
     * @param x2 coordenada x de la línea dos
     * @param y2 coordenada y de la línea dos
     * @param x3 coordenada x de la línea tres
     * @param y3 coordenada y de la línea tres
     */
    public Tríangulo(double x1, double y1, double x2, double y2, double x3, double y3){
        Vector2 uno = new Vector2(x1,y1);
        this.a = uno;
        Vector2 dos = new Vector2(x2,y2);
        this.b = dos;
        Vector2 tres = new Vector2(x3,y3);
        this.c = tres;
    }
    /**
     * Constructor que crea un tríangulo con tres vectores con coordenadas (0,0),(5,5),(10,0)
     */
    public Tríangulo(){
        Vector2 uno = new Vector2(0.0,0.0);
        Vector2 dos = new Vector2(5.0,5.0);
        Vector2 tres = new Vector2(10.0,0.0);
        this.a = uno;
        this.b = dos;
        this.c = tres;
    }
    /**
     * Método que genera un tríangulo en svg
     * @return cadena con instrucciones para el tríangulo
     */
    public String toSVG(){
        String tri="< polygon points= '"+this.a.getx()+","+this.a.gety()+" "+this.b.getx()+","+this.b.gety()+" "+this.c.getx()+","+this.c.gety()+"' />";
        return tri;
    }
    /**
     * Método que nos muestra los puntos del tríangulo
     */
    public String toString(){
        String trin = "Tríangulo que va del punto("+this.a.getx()+","+this.a.gety()+") al punto ("+this.b.getx()+","+this.b.gety()+") al punto ("+this.c.getx()+","+this.c.gety()+")";
        return trin;
    }
    /**
     * Método que compara si dos tríangulos son iguales 
     * @param t Tríangulo t
     * @return Verdadero si son iguales falso si nos son iguales 
     */
    public boolean equals(Tríangulo t){
        if(this.a.equals(t.a) && this.b.equals(t.b) && this.c.equals(t.c)){
            return true;
        }else{
            return false;
        }
    }
}