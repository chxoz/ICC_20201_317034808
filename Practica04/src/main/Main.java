package main;
import shapesSVG.*; 
public class Main{
    public static void main(String[] args){
        String inicio ="<svg heigth='700' width='700'>";
        String  cierre = "</svg>";
        Vector2 vec = new Vector2(50, 50);
        Vector2 vec2 = new Vector2(200 , 200);
        Vector2 vec3 = new Vector2(350,350);
        Vector2 vec4 = new Vector2(500,200);
        Línea lin = new Línea(100, 50, 200, 50);
        Círculo cir = new Círculo(400, 100, 45);
        Tríangulo tri = new Tríangulo(vec2, vec3, vec4);
        Rectángulo rec = new Rectángulo(100, 100, 100,125 );
        System.out.println(inicio);
        System.out.println(vec.toSVG());
        System.out.println(lin.toSVG());
        System.out.println(cir.toSVG());
        System.out.println(tri.toSVG());
        System.out.println(rec.toSVG());
        System.out.println(cierre);
    }
}