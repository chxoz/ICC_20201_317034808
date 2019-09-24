package shapesSVG;
/**
 * Clase que modela un círculo
 */
public class Círculo{
    private Vector2 centro;
    private double radio;
    private double perímetro;
    private double area;
    /**
     * Constructor que genera un círculo con un centro y un radio
     * @param centro Vector que da el centro del círculo
     * @param radio valor del radio
     */
    public Círculo(Vector2 centro,double radio){
        this.centro = centro;
        this.radio = radio;
    }
    /**
     * Constructor que genera un círculo
     * @param x coordenada x del centro
     * @param y coordenada y del centro
     * @param radio valor delradio
     */
    public Círculo(double x, double y, double radio){
        Vector2 uno = new Vector2(x,y);
        this.centro = uno;
        this.radio =radio;
    }
    /**
     * Constructor que genera un círculo con centro en (0,0) y radio de 5.0
     */
    public Círculo(){
        Vector2 uno = new Vector2(0,0);
        this.centro = uno;
        this.radio = 5.0;
    }
    /**
     * Método que genera un círculo en svg
     * @return cadena con instrucciones para el circulo
     */
    public String toSVG(){
        String tosvg = "<circle cx='"+this.centro.getx()+"' cy='"+this.centro.gety()+"' r='"+this.radio+"' stroke='green' stroke-width='4' fill='yellow' />";
        return tosvg;
    }
    /**
     * 
     */
    public String toString(){
        String cir ="círculo con centro en ('"+this.centro.getx()+"','"+this.centro.gety()+"') y radio '"+this.radio+"'";
        return cir; 
    }
    public boolean equals(Círculo cir){
        if(this.radio==cir.radio && this.centro==cir.centro){
            return true;
        }else{
            return false;
        }
    }
}