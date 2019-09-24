package shapesSVG;
/**
*Clase que hace un vector
*/
public class Vector2{
    private double x;
    private double y;
    private double magnitud;
/**
 * Constructor que hace un vector 
 * @param x el número de la coordenada en el eje de las abcisas
 * @param y el número de la coordenada en el eje de las ordenadas
 */
    public Vector2 (double x,double y){
        this.x = x;
        this.y = y;
    }
    /**
     * Es un constructor que nos genera una pareja ordenada en (0,0)
     */
    public Vector2(){
        this.x = 0;
        this.y = 0;
    }
    /**
     * Método observador de x
     * @return valor 
     */
    public double getx(){
        return this.x;
    }
    /**
     * Método modificador de x
     * @param px nuevo valor de x
     */
    public void setx(double px){
        this.x = px;
    }
    /**
     * Método observador de y
     * @return y
     */
    public double gety(){
        return this.y;
    }
    /**
     * Método modificador de y
     * @param py nuevo valor de y
     */
    public void sety(double py){
        this.y = py;
    }
    /**
     * Método para calcular la destancia de dos vectores 
     * @param otro nombre del vector 
     */
    public double distancia(Vector2 otro){
        double dis = Math.sqrt(Math.pow(this.x-otro.x,2)+Math.pow(this.y-otro.y,2));
        return dis;
    }
    /**
     * Método que regresa una cadena para que processing genere un círculo con ciertas características
     */
    public String toSVG(){
        String tosvg = "<circle cx='"+this.x+"' cy='"+this.y+"' r='4' stroke='green' stroke-width='4' fill='green' />";
        return tosvg;
    }
    /**
     * Método que nos regresa una cadena que muestra los atributos del vector 
     */
    public String toString(){
        String vec = "Vector con coordenadas ("+this.x+","+this.y+")";
        return vec;
    }
    /**
     * Método que verifca si dos vectores son iguales o no
     * @param v es un vector que usaremos para comparar sus atributos con otro vector 
     */
    public boolean equals(Vector2 v){
        if(this.x==v.x && this.y==v.x){
            return true;
        }else{
            return false;
        }

    }
}